<?php
session_start();
if (!isset($_SESSION["userName"])) {
    header('Location: Login.php');
}

$email = $_SESSION["userName"];

$servername = "localhost";
$username = "root"; // Your MySQL username
$password = ""; // Your MySQL password
$dbname = "bookergym"; // Your MySQL database name

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

if (isset($_POST['commentID']) && isset($_POST['newComment'])) {
    $commentID = $_POST['commentID'];
    $newComment = $_POST['newComment'];

    // Update comment in the database
    $stmt = $conn->prepare("UPDATE review SET comment = ? WHERE reviewID = ?");
    $stmt->bind_param("ss", $newComment, $commentID);

    if ($stmt->execute()) {
        echo "Comment updated successfully.";
    } else {
        echo "Error updating comment: " . $conn->error;
    }

    $stmt->close();
}

$conn->close();
?>
