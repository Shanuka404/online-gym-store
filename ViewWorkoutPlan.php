<?php session_start();
if(!isset($_SESSION["userName"]))
{
	header('Location:Login.php');
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Workout Plans</title>
    <link rel="stylesheet" href="vwp.css"> 
    <script>
document.addEventListener('DOMContentLoaded', function() {
    var categorySelector = document.getElementById('categorySelector');
    var categories = document.querySelectorAll('.category');

    categorySelector.addEventListener('change', function() {
        var selectedCategory = categorySelector.value;

        categories.forEach(function(category) {
            category.style.display = 'none';
        });

        if (selectedCategory === 'all') {
            categories.forEach(function(category) {
                category.style.display = 'block';
            });
        } else {
            document.querySelector('.' + selectedCategory).style.display = 'block';
        }
    });
});
</script>

    <style>
    p{
        font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
    }
    .daybox{
        background: #9e9c9c;
        padding: 10px;
        border-radius: 15px;
        margin: 15px;
    }

    .workout-plan {
        margin: 10px;
    }
    h3 {
    color: #373737;
}
    </style>
</head>

<body>
<header>
        <div class="logo">Booker Gym</div>
        <nav>
            <ul>
                <li><a href="Home.php">Home</a></li>
                <li><a href="ProductsC.php">Products</a></li>
                <li><a href="ViewWorkoutPlan.php">&#9733 WorkOut Plans</a></li>
                <li><a href="rate.php">Rating</a></li>
            </ul>
        </nav>
</header>
<br><br><br>
    <h1>Workout Plans</h1>
    <select id="categorySelector" align="left">
        <option value="all">All</option>
        <option value="beginners">Beginners</option>
        <option value="intermediate">Intermediate</option>
        <option value="advanced">Advanced</option>
    </select>
    <br><br><br>
    <div class="workout-categories" align="center">
        <div class="category beginners">
            <br>
            <h2>Beginners</h2>
            <div id="beginnersPlans"></div>
            <br><br>
        </div>
        <br><br><br>
        <div class="category intermediate">
            <br>
            <h2>Intermediate</h2>
            <div id="intermediatePlans"></div>
            <br><br>
        </div>
        <br><br><br>
        <div class="category advanced"><br>
            <h2>Advanced</h2>
            <div id="advancedPlans"></div>
            <br><br>
        </div>
    </div>

    <br><br><br>
    <footer>
        <p>© 2023 Booker Gym</p>
    </footer>
    <br>
    <script src="vwp.js"></script> <!-- Include your JavaScript file -->
</body>

</html>
