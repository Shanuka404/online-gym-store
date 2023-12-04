<?php
session_start();

if (!isset($_SESSION["userName"])) {
    header('Location: Login.php');
    exit();
}

if (isset($_POST["commentID"])) {
    $commentID = $_POST["commentID"];

    $con = mysqli_connect("localhost", "root", "", "bookergym");

    if (!$con) {
        die("Sorry, We are facing a technical issue");
    }

    $sql3 = "DELETE FROM review WHERE reviewID = ?";
    $stmt3 = mysqli_prepare($con, $sql3);
    mysqli_stmt_bind_param($stmt3, "s", $commentID);

    if (mysqli_stmt_execute($stmt3)) {
        echo "Comment deleted successfully.";
    } else {
        echo "Error deleting comment: " . mysqli_error($con);
    }

    mysqli_stmt_close($stmt3);
    mysqli_close($con);
} else {
    echo "Invalid request.";
}
?>
