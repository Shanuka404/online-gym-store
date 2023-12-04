<?php 
if (isset($_POST["btnSubmit"]))
{
    $name = $_POST["txtName"];
	$email = $_POST["txtEmail1"];
	$password = $_POST["txtPassword1"];
	$contactNumber = $_POST["txtTphone"];
    $address = $_POST["txtaddress"];

	$con = mysqli_connect("localhost", "root", "", "bookergym", "3306"); //connect to the DB

    if(!$con) {
        die ("Sorry we are facing some tech issues"); // If error occurs pause the page
    }

    // Step 2: Retrieve the last customerID from the database
    $sql = "SELECT customerID FROM customer ORDER BY customerID DESC LIMIT 1";
    $result = $con->query($sql);

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        $lastCustomerID = $row['customerID'];
    } else {
        $lastCustomerID = 'CS999'; // Assuming no customerIDs exist yet
    }

    // Step 3: Extract the numeric part of the customerID
    $numericPart = (int)substr($lastCustomerID, 2);

    // Step 4: Generate the next customerID
    $newNumericPart = $numericPart + 1;
    $newCustomerID = 'CS' . str_pad($newNumericPart, 4, '0', STR_PAD_LEFT);

    // Now, $newCustomerID will contain the auto-generated customerID

    $sql = " INSERT INTO `customer` (`customerID`,`customerName`,`email`,`password`,`number`,`address` ) VALUES ('".$newCustomerID."','".$name."','".$email."', '".$password."','".$contactNumber."', '".$address."' );" ;
    
    if (mysqli_query($con, $sql)) {
        echo '<script>alert("Data added successfully.");</script>';
        header('location:Home.php');
    } else {
        echo '<script>alert("Error adding data: ' . $conn->error . '");</script>';
    }
}
else {
    echo "Unsuccessful";
}
?>
