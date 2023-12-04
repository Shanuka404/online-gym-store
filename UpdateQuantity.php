<?php
if (isset($_GET["cartID"]) && isset($_GET["quantity"])) {
    $cartID = $_GET["cartID"];
    $quantity = $_GET["quantity"];

    $con = mysqli_connect("localhost", "root", "", "bookergym");

    if (!$con) {
        die("Sorry, We are facing a technical issue");
    }

    $sql = "UPDATE cart SET quantity = $quantity WHERE cartID = $cartID";
    mysqli_query($con, $sql);

    // Return the updated total price (if needed)
    // This assumes you have a function to calculate the total price
    $totalPrice = calculateTotalPrice($con);

    mysqli_close($con);

    echo $totalPrice;
}
?>
