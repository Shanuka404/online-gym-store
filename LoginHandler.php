<?php
session_start();

if(isset($_POST["btnSubmitL"])) {
    $con = mysqli_connect("localhost", "root", "", "bookergym", "3306");
    if (!$con) {
        die("Sorry, We are facing a technical issue");
    }

    $username = $_POST["txtEmail"];
    $password = $_POST["txtPassword"]; 

    $sql_customer = "SELECT * FROM `customer` WHERE `email` = '" . $username . "' AND `password` = '" . $password . "'";
    $results_customer = mysqli_query($con, $sql_customer);

    if (mysqli_num_rows($results_customer) > 0) {
        $_SESSION["userName"] = $username;
        $_SESSION["Password"] = $password;
        header('Location: Home.php');
        exit();
    } else {
        header('Location: Login.php?error=InvalidCredentials'); // Redirect with an error message
        exit();
    }
} else {
    header('Location: Login.php');
    exit();
}
?>
