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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booker Gym - Home</title>
    <link rel="stylesheet" href="Homestyle.css">
    <link rel="stylesheet" href="stylerate.css">
    <header>
        <div class="logo">Booker Gym</div>
        <nav>
            <ul>
                <li><a href="Home.php">&#9733 Home</a></li>
                <li><a href="Cart.php">Cart</a></li>
                <li><a href="rate.php">Rating</a></li>
                <li><a href="History.php">History</a></li>
                <li><a href="Logout.php">Signout</a></li>
            </ul>
        </nav>
    </header>


    <style>
        .c{
            display: flex;
        }
        .container {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            border: 1px solid #333;
            border-radius: 10px;
            padding: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            background-color: #fff;
            justify-content: center;
            align-items: center;
            width: 30%;
        }

        .container :hover{
            background-color: #333;
        }
        .image-container {
            flex: 1;
            margin: 5px;
            position: relative;
            transition: transform 0.3s;
        }


        .image-container img {
            max-width: 100%;
            height: auto;
            display: block;
            border-radius: 5px;
        }

        .image-container h2 {
            font-size: 24px;
            font-weight: bold;
            text-align: center;
        }

        .image-container:hover {
            transform: translateY(-5px);
        }

        .image-container img:hover {
            filter: brightness(70%);
        }
        @media (min-width: 768px) {
            .container {
                justify-content: space-between;
            }
        }
        // css example
        span {
            content: "\2192";
        }
        .arrow-icon {
            font-size: 40px; /* Adjust the font size as needed */
        }

    </style>
</head>

<body>
    
    <br><br><br><br><br>
    <h2>Welcome to Booker Gym</h2>
    <section>
        <main>
            <img src="Image/1.png" alt="Description of the image">
        </main>
    </section>
    <br><br><br>

    <div class="c">
    <div class="container">
        <div class="image-container">
            <img src="Image/ProductView.webp" alt="View Products" onclick="viewProducts()">
            <h2>View Products <span class="arrow-icon">&#8594;</span></i></h2>
        </div>
        </div>
        <div class="container">
        <div class="image-container">
            <img src="Image/6.jpg" alt="View Workout Plans" onclick="viewWorkoutPlans()">
            <h2>View Workout Plans <span class="arrow-icon">&#8594;</span></i></h2>
        </div>
    </div>
    </div>
    <section class="cta">
        <h1>Visit Prodcts For Our Website to Shop Branded GYM Items Anyware from The World..</h1>
        <a href="ProductsC.php" class="btn">View Products</a>
    </section>
    <section class="footer">
        <h4>ABOUT US</h4>
        <p>Booker Gym is a start-up online sales platform that has been formed to sell 
            gym equipment, especially for fitness enthusiasts in Sri Lanka.<br>
            Equipment is directly imported from the USA since we are committed to providing branded items to the customers.<br>
            Also, we are so excited to announce that the online purchases will reach safely our customers with ensured delivery services.<br> 
            Home Fitness is already blessed with the exclusive license in sales agents which<br>
            makes us more responsible in looking for a user-friendly platform in the purchasing process.</p>
            <div class="icons1">
                <a href="#"><ion-icon name="logo-facebook"></ion-icon></a>
                <a href="#"><ion-icon name="logo-instagram"></ion-icon></a>
                <a href="#"><ion-icon name="logo-twitter"></ion-icon></a>
                <a href="#"><ion-icon name="logo-google"></ion-icon></a>
                <a href="#"><ion-icon name="logo-skype"></ion-icon></a>
            </div>
    </section>

    
    <footer>
        <p>© 2023 Booker Gym</p>
    </footer>

    <script>
        function viewProducts() {
            window.location.href = 'ProductsC.php'; // Replace with the actual URL
        }

        function viewWorkoutPlans() {
            window.location.href = 'ViewWorkoutPlan.php'; // Replace with the actual URL
        }
    </script>
    
    <script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>

</body>

</html>
