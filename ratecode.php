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

    // Check connection
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // Step 2: Retrieve the last rateID from the database
    $sql = "SELECT reviewID FROM review ORDER BY reviewID DESC LIMIT 1";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        $lastRateID = $row['reviewID'];
    } else {
        $lastRateID = 'RT999'; // Assuming no rateIDs exist yet
    }

    // Step 3: Extract the numeric part of the rateID
    $numericPart = (int)substr($lastRateID, 2);

    // Step 4: Generate the next rateID
    $newNumericPart = $numericPart + 1;
    $newRateID = 'RT' . str_pad($newNumericPart, 4, '0', STR_PAD_LEFT);

    // Get Customer Name
    $sql6 = "SELECT customerName, customerID FROM customer WHERE email= ?";
    $stmt6 = mysqli_prepare($conn, $sql6);
    mysqli_stmt_bind_param($stmt6, "s", $email);
    mysqli_stmt_execute($stmt6);
    $result6 = mysqli_stmt_get_result($stmt6);

    if ($result6->num_rows > 0) {
        $row = $result6->fetch_assoc();
        $name = $row['customerName'];
        $customerID = $row['customerID'];
    } else {
        $name = "Unknown"; // Set a default name if none is found
        $customerID = "-9999";
    }


    $rating = $_POST['rating'];
    $comment = $_POST['comment'];


    // Now, $newRateID will contain the auto-generated rateID 
    $sql = " INSERT INTO `review` (`reviewID`, `customerID`, `customerName`, `rate`, `comment`) 
  VALUES ('".$newRateID."', '".$customerID."', '".$name."', '".$rating."', '".$comment."' );" ;

    if ($conn->query($sql) === TRUE) {
        echo '<script>alert("Review the App successfully.");</script>';
        echo '<script>document.getElementById("customerName").value = ""; document.getElementById("rate").value = ""; document.getElementById("comment").value = "";</script>';
        echo head('rate.php');
    } else {
        echo '<script>alert("Error adding data: ' . $conn->error . '");</script>';
    }

    $conn->close();

    
?>
