<?php

$email = $_SESSION["userName"];

$servername = "localhost";
$username = "root"; // Your MySQL username
$password = ""; // Your MySQL password
$dbname = "bookergym"; // Your MySQL database name

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
$sql6 = "SELECT customerID FROM customer WHERE email= ?";
$stmt6 = mysqli_prepare($conn, $sql6);
mysqli_stmt_bind_param($stmt6, "s", $email);
mysqli_stmt_execute($stmt6);
$result6 = mysqli_stmt_get_result($stmt6);

if ($result6->num_rows > 0) {
    $row = $result6->fetch_assoc();
    $ID = $row['customerID'];
} else {
    $ID = "Unknown"; // Set a default name if none is found
}

$sql = "SELECT * FROM review";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        echo '<div class="commentFrame">';
        echo '<p class="userName">' . $row['customerName'] . '</p>';
        echo '<p class="userComment">' . $row['comment'] . '</p>';
        echo '<p>  </p>';
    
        if ($row['customerID'] == $ID) {
            echo '<div class="icon-container">';
            echo '<button class="edit-button" data-comment-id="' . $row['reviewID'] . '"><i class="bx bxs-edit edit-icon"></i></button>';
            echo '<button class="delete-button" data-comment-id="' . $row['reviewID'] . '"><i class="bx bx-x delete-icon"></i></button>';
            echo '</div>';
        }
        
                                    
        
        echo '</div>';
    }
} else {
    echo '<p>No comments yet.</p>';
}

$conn->close();

?>
