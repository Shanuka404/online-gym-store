<?php
session_start();
if (!isset($_SESSION["userName"])) {
    header('Location: Login.php');
    exit();
}

if (isset($_GET["id"])) {
    $cartID = $_GET["id"];


    $con = mysqli_connect("localhost", "root", "", "bookergym");

    if (!$con) {
        die("Sorry, We are facing a technical issue");
    }
    $email = $_SESSION["userName"];
    
    // Retrieve cart item details
    $sql = "SELECT * FROM `cart` WHERE cartID = ?";
    $stmt = mysqli_prepare($con, $sql);
    mysqli_stmt_bind_param($stmt, "s", $cartID);
    mysqli_stmt_execute($stmt);
    $result = mysqli_stmt_get_result($stmt);

    if (mysqli_num_rows($result) > 0) {
        $row = mysqli_fetch_assoc($result);

        // Insert into history table
        $supplementName = $row["supplementName"];
        $cusID = $row["customerID"];
        $picture = $row["picture"];
        $quantity = $row["quantity"];
        $price = $row["price"];
        $status="Incomplete";

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

        $sql1 = "INSERT INTO history (historyID, supplementName, cusID, picture, quantity, price, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        $stmt2 = mysqli_prepare($con, $sql1);
        mysqli_stmt_bind_param($stmt2, "ssssdds", $newHistoryID, $supplementName, $cusID, $picture, $quantity, $price, $status);
        mysqli_stmt_execute($stmt2);

        mysqli_stmt_close($stmt2);
        
        // Remove from cart table
        $sql3 = "DELETE FROM cart WHERE cartID = ?";
        $stmt3 = mysqli_prepare($con, $sql3);
        mysqli_stmt_bind_param($stmt3, "s", $cartID);
        mysqli_stmt_execute($stmt3);
        $result3 = mysqli_stmt_get_result($stmt3);
        mysqli_close($con);
        
        echo "<script>alert('Purchase successful!');</script>";
        header('Location: Cart.php'); // Redirect to Cart page
        exit();
    } else {
        header('Location: Cart.php?error=InvalidItem');
        exit();
    }
} else {
    header('Location: Cart.php?error=InvalidRequest');
    exit();
}
?>
