<?php
session_start();
if (!isset($_SESSION["userName"])) {
    header('Location: Login.php');
    exit();
}
if (isset($_GET["id"])) {

    $productId = $_GET["id"];

    $con = mysqli_connect("localhost", "root", "", "bookergym");

    if (!$con) {
        die("Sorry, We are facing a technical issue");
    }
    //--------------------------------------------------------//
    // Step 2: Retrieve the last HistoryID from the database
    $sql1 = "SELECT historyID FROM history ORDER BY historyID DESC LIMIT 1";
    $result1 = $con->query($sql1);

    if ($result1->num_rows > 0) {
        $row = $result1->fetch_assoc();
        $lastHistoryID = $row['historyID'];
    } else {
        $lastHistoryID = 'HS999'; // Assuming no customerIDs exist yet
    }

    // Step 3: Extract the numeric part of the customerID
    $numericPart = (int)substr($lastHistoryID, 2);

    // Step 4: Generate the next customerID
    $newNumericPart = $numericPart + 1;
    $newHistoryID = 'HS' . str_pad($newNumericPart, 4, '0', STR_PAD_LEFT);


    //--------------------------------------------------------//
    // Step 2: Retrieve the last cartID from the database
    $sql5 = "SELECT cartID FROM cart ORDER BY cartID DESC LIMIT 1";
    $result5 = $con->query($sql5);

    if ($result5->num_rows > 0) {
        $row = $result5->fetch_assoc();
        $lastcartID = $row['cartID'];
    } else {
        $lastcartID = 'CT999'; // Assuming no customerIDs exist yet
    }

    // Step 3: Extract the numeric part of the customerID
    $numericPart = (int)substr($lastcartID, 2);

    // Step 4: Generate the next customerID
    $newNumericPart = $numericPart + 1;
    $newcartID = 'CT' . str_pad($newNumericPart, 4, '0', STR_PAD_LEFT);

    //--------------------------------------------------------//

    $sql = "SELECT * FROM supplements WHERE supplementID = ?";
    $stmt = mysqli_prepare($con, $sql);
    mysqli_stmt_bind_param($stmt, "s", $productId);
    mysqli_stmt_execute($stmt);
    $result = mysqli_stmt_get_result($stmt);

    if (mysqli_num_rows($result) > 0) {
        $product = mysqli_fetch_assoc($result);
        // Assuming you have a $_SESSION["userID"] for the customer ID
        $sql2 = "SELECT customerID FROM customer WHERE email = ?";
        $stmt1 = mysqli_prepare($con, $sql2);
        mysqli_stmt_bind_param($stmt1, "s", $_SESSION["userName"]);
        mysqli_stmt_execute($stmt1);
        $result2 = mysqli_stmt_get_result($stmt1);

        if (mysqli_num_rows($result2) > 0) {
            $row = mysqli_fetch_assoc($result2);
            $CusId = $row["customerID"];
        } else {
            echo "User not found";
        }
        if (isset($_POST["quantity"])) {
            $quantity = $_POST["quantity"];
            $totalPrice = $quantity * $product["price"];
            $status="Incomplete";
        
            if (isset($_POST["btnBuy"])){
                $supplementID = $_POST["supplementID"];
                $name = $_POST["supplementName"];
                
                $sql = "INSERT INTO history (historyID, supplementName, cusID, picture, quantity, price, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
                $stmt2 = mysqli_prepare($con, $sql);
                mysqli_stmt_bind_param($stmt2, "ssssdds", $newHistoryID, $name, $CusId, $product["picture"], $quantity, $totalPrice, $status);
                mysqli_stmt_execute($stmt2);

                mysqli_stmt_close($stmt2);
                mysqli_close($con);

                echo "<script>alert('Purchase successful!');</script>";

            }else if(isset($_POST["btnCart"])){
                $supplementID = $_POST["supplementID"];
                $name = $_POST["supplementName"];
                
                $sql = "INSERT INTO cart (cartID, customerID, supplementName, picture, price, quantity) VALUES (?, ?, ?, ?, ?, ?)";
                $stmt2 = mysqli_prepare($con, $sql);
                mysqli_stmt_bind_param($stmt2, "ssssdd", $newcartID, $CusId, $name, $product["picture"], $totalPrice, $quantity);
                mysqli_stmt_execute($stmt2);

                mysqli_stmt_close($stmt2);
                mysqli_close($con);

                echo "<script>alert('Product added to the cart successful!');</script>";
            }
        }
        } else {
            header('Location: Home.php?error=ProductNotFound');
            exit();
        }
    mysqli_stmt_close($stmt);
    
    
} else {
    header('Location: Home.php?error=InvalidRequest');
    exit();
}
?>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php echo $product["supplementName"]; ?> - Product Details</title>
    <link rel="stylesheet" href="ProductDetails.css">

    <style>
    .btn{
        background: #837f7f;
    }
    .product-details h2{
        font-size: 35px;
        font-family: Georgia, 'Times New Roman', Times, serif;
    }
    .product-details p{
        margin-top: 1.5rem;
        font-family: Georgia, 'Times New Roman', Times, serif;
    }
    .quantity{
        background: rgba(0, 0, 0, 0.3);
        border-radius: 15px;
        height: 20px;
        width: 50px;
        padding: 5px;
        margin-top: 1.5rem;
        margin-bottom: 1rem;
        text-align: center;
    }

    .frame{
        display: flex;
        width: 700px;
        gap: 4rem;
    }

    .frame img {
    width: 280px;
    /* max-width: 80%; */
    height: auto;
    border: 1px solid #ccc;
}

.price{
    font-weight: bold;
}

.descript{
    font-family: Verdana, Geneva, Tahoma, sans-serif;
    color: #837f7f;
}

    </style>
</head>

<body>
    <header>
        <div class="logo">Booker Gym</div>
        <nav>
            <ul>
                <li><a href="Home.php">Home</a></li>
                <li><a href="Cart.php">Cart</a></li>
                <li><a href="History.php">History</a></li>
                <li><a href="ProductsC.php">Back</a></li>
            </ul>
        </nav>
    </header>
    <br><br><br><br><br><br><br><br>
    <div class="frame">
        <div><img src="<?php echo $product["picture"]; ?>" alt="<?php echo $product["supplementName"]; ?>"></div>
        <div class="product-details">
        <form action="ProductDetails.php?id=<?php echo $productId; ?>" method="post">
            <input type="hidden" name="supplementID" value="<?php echo $product["supplementID"]; ?>">
            <input type="hidden" name="supplementName" value="<?php echo $product["supplementName"]; ?>">
            <h2><?php echo $product["supplementName"]; ?></h2>
            <p>Flavour: <?php echo $product["flavor"]; ?></p>
            <p class="price">Price: Rs.<?php echo $product["price"]; ?>.00/=</p>
            <p>Size: <?php echo $product["size"]; ?></p>
            <p class="descript">Description: <?php echo $product["description"]; ?></p>
            Quantity: <input type="number" class="quantity" id="quantity" name="quantity" value="1" min="1"><br>
            <input type="submit" class="btn" name="btnBuy" value="Buy Now">
            <input type="submit" class="btn" name="btnCart" value="Add to Cart">
        </form>

        </div>
    </div>

    <footer>
        <p>© 2023 Booker Gym</p>
    </footer>
</body>

</html>
