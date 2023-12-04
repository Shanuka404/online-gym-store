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
    header('Location: Cart.php?error=InvalidRequest');
    exit();
}
?>