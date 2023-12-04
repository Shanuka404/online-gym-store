<?php
session_start();
if (!isset($_SESSION["userName"])) {
    header('Location: Login.php');
    exit();
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
    <link rel="shortcut icon" href="/Images/Title.png" type="image/png">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

    <link rel="stylesheet" href="Homestyle.css">
    <link rel="stylesheet" href="stylerate.css">
    <link rel="stylesheet" href="Cart.css">
</head>
<body>
<header>
        <div class="logo">Booker Gym</div>
        <nav>
            <ul>
                <li><a href="Home.php">Home</a></li>
                <li><a href="Cart.php">&#9733 Cart</a></li>
                <li><a href="rate.php">Rating</a></li>
                <li><a href="History.php">History</a></li>
                <li><a href="Logout.php">Signout</a></li>
            </ul>
        </nav>
</header>
<br><br><br><br><br>
<div class="cart">
<div class="heading">
        <h2>Shopping Cart</h2>
    </div>
</div>
<br>
    <div class="cart">
    <div class="small-container">
        <table>
       
            <tr>
                <th>Product</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Sub-Total</th>
            </tr>
            <?php
            //connect with database
            $con = mysqli_connect("localhost","root","","bookergym","3306");
                
            //Error handling
            if(!$con)
            {
                die("Sorry,We are facing a technical issue");
            }

            $email = $_SESSION["userName"];
            // SQL query with a WHERE clause to filter by cusID
            $sql ="SELECT * FROM `cart` WHERE customerID = (SELECT customerID FROM customer WHERE email = '$email') ";

            //Execute the querry against the database
            $result = mysqli_query($con,$sql);
            $totalPrice = 0; // Initialize total price variable

            if(mysqli_num_rows($result)>0)

            
            {
                while($row = mysqli_fetch_assoc($result))
                {
                    // Calculate the total for each item
                    $itemTotal = $row["price"] * $row["quantity"];
                    
                    // Add the item total to the overall total
                    $totalPrice += $itemTotal;
                        
                    ?>
                                <tr>
                                <td>
                                    <div class="cart-info">
                                        <img src="<?php echo $row["picture"]; ?>">
                                    </div>
                                </td>
                                <td><?php echo $row["supplementName"]; ?></td>
                                <td>Rs.<?php echo $row["price"]; ?>.00/=</td>
                                <td>
                                    <input type="number" name="quantity" value="<?php echo $row["quantity"]; ?>" min="1" onchange="updateQuantity(<?php echo $row['cartID']; ?>, this.value)">
                                </td>
                                <td>Rs.<?php echo number_format($itemTotal, 2); ?>.00/=</td>
                                <td>
                                    <button id="submit" class="buy-btn" ><a href="Purchase.php?id=<?php echo $row["cartID"]; ?>">Purchase</a></button>
                                    
                                    <button id="submit" class="remove-btn"><a href="DeleteCart.php?id=<?php echo $row["cartID"]; ?>">Delete</a></button>
                                </td>
                            </tr>
                    <?php
                }
            }
                mysqli_close($con);//close the connection
            ?>
            <tr>
                <td colspan="4" style="text-align: right; font-weight: bold;">Total</td>
                <td>Rs.<?php echo number_format($totalPrice, 2); ?>.00/=</td>
                <td></td> <!-- Add an empty cell for the button column -->
            </tr>
        </table>
    </div>
    
    </div>
    <script>
    function updateQuantity(cartID, newQuantity) {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                console.log("Quantity updated successfully!");
            }
        };
        xhttp.open("GET", "UpdateQuantity.php?cartID=" + cartID + "&quantity=" + newQuantity, true);
        xhttp.send();
    }
</script>

    <footer>
        <p>© 2023 Booker Gym</p>
    </footer>
</body>
</html>