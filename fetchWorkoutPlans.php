<?php
$con = mysqli_connect("localhost", "root", "", "bookergym");

if (!$con) {
    die("Sorry, We are facing a technical issue");
}

$category = $_GET["category"];
$query = "SELECT * FROM workoutplans";

if ($category !== "all") {
    $query .= " WHERE category='$category'";
}

$result = mysqli_query($con, $query);

$workoutPlans = [];

while ($row = mysqli_fetch_assoc($result)) {
    $workoutPlans[] = $row;
}

echo json_encode($workoutPlans);
mysqli_close($con);
?>
