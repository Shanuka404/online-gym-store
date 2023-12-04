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

    <script>
        function filterProducts(category) {
            var products = document.getElementsByClassName('box');
            for (var i = 0; i < products.length; i++) {
                var productCategory = products[i].getAttribute('category-dropdown');
                if (category === 'all' || productCategory === category) {
                    products[i].style.display = 'block';
                } else {
                    products[i].style.display = 'none';
                }
            }
        }

        function searchProducts() {
            var input = document.getElementById('searchInput').value.toLowerCase();
            var products = document.getElementsByClassName('box');

            for (var i = 0; i < products.length; i++) {
                var productName = products[i].getElementsByTagName('h3')[0].innerText.toLowerCase();
                if (productName.includes(input)) {
                    products[i].style.display = 'block';
                } else {
                    products[i].style.display = 'none';
                }
            }
        }
    </script>

    <style>
        body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f5f5f5;
        text-align: center;
        }
        .products
        {
            justify-content: center;
            color: #000000;
            overflow: auto;
            height: 600px;
        }

        .heading
        {
            text-align: center;
        }

        .heading h2
        {
            font-size: 1.8rem;
            text-transform: uppercase;
        }


        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            display: flex;
            justify-content: space-between;
            align-items: center;
            position: fixed;
            width: 100%;
            z-index: 1000; /* Ensures it's above other content */
        }

        .logo {
            font-size: 24px;
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            display: flex;
        }

        nav li {
            margin: 0 10px;
        }

        nav a {
            text-decoration: none;
            color: #fff;
            font-size: 16px;
        }

        nav a:hover {
            color: #ff8c00; /* Orange color on hover */
        }
        .categoryBox{
            background: rgba(0, 0, 0, 0.1);
            width: auto;
            height: 2.5rem;
            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        }
        .product-container {
            width: 100%;
            display: flex;
            flex-wrap: wrap;
            gap: 5rem; 
            justify-content: center;
            
        }
        .product-container .box h3
        {
            font-size: 1rem;
            font-weight: 600;
            text-transform: uppercase;
            margin: 0.5rem 0 0.5rem;
            text-align: center;
        }
        .product-container .box .content
        {
            display: flex;
            align-items: center;
            justify-content: space-around;
        }

        .product-container .box .content span
        {
            padding: 5px 1rem;
            color: #000000;
            background-color: #ffffff;
            border-radius: 0px;
            font-weight: 500;
        }

        .product-container .box {
            flex: 0 0 calc(25% - 1rem); /* Set the width to 33.33% with 1rem gap */
            position: relative;
            padding: 10px;
            justify-content: center;
            background: rgb(230, 230, 230);
            color: rgb(0, 0, 0);
            border-radius: 0.5rem;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .product-container .box a{
            text-decoration: none; /* Remove the underline */
            color: inherit; /* Use the default text color (usually black) */
        }

        .product-container .box:hover{
            transform: scale(1.05); /* Enlarge the box on hover */
            background-color: #333; /* Change the background color on hover */
            color: white;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            font-size: 1rem;
            text-align: center;
            text-decoration: none;
            background: #333;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s;
        }

        .btn:hover {
            background: #555;
        }
        .product-container img{
            width: 85%;
            height: 250px;
            object-fit: contain;
            object-position: center;
            padding: 20px;
            background: rgb(255, 252, 252);
            border-radius: 0.5rem;
        }


    </style>
</head>

<body>
    <header>
        <div class="logo">Booker Gym</div>
        <nav>
            <ul>
                <li><a href="Home.php">Home</a></li>
                <li><a href="ProductsC.php">&#9733 Products</a></li>
                <li><a href="ViewWorkoutPlan.php">Workout Plans</a></li>
                <li><a href="rate.php">Rating</a></li>
            </ul>
        </nav>
    </header>
    <br><br><br>
    <div class="search">
        <form action="#" method="post" id="searchForm">
            <input class="srch" type="search" id="searchInput" name="search" placeholder="Type To Search">
            <button class="btn" type="button" onclick="searchProducts()">Search</button>
        </form>
    </div>
    <br>
    <!-- Add a dropdown for categories -->
    <div class="category-dropdown" align="left">
    <label for="category">Select Category:</label>
    <select class="categoryBox" id="category" name="category" onchange="filterProducts(this.value)">
        <option value="all">All Categories</option>
        <option value="Whey Protien">Whey Protein</option>
        <option value="Mass Gainer">Mass Gainer</option>
        <option value="Vitomin">Vitamin</option>
        <option value="Creatine">Creatine</option>
        <option value="Others">Others</option>
    </select>
</div>

    <section class="products" id="products">
        <div class="heading">
            <h2>Our Selling Products</h2>
        </div>
        
        <?php
        //connect with database
        $con = mysqli_connect("localhost","root","","bookergym","3306");
            
        //Error handling
        if(!$con)
        {
            die("Sorry,We are facing a technical issue");
        }

        //sql querry
        $sql ="SELECT * FROM `supplements` ";

        //Execute the querry against the database
        $result = mysqli_query($con,$sql);
        ?>

        <div class="product-container">
            <?php
                if(mysqli_num_rows($result)>0)
                {
                    while($row = mysqli_fetch_assoc($result))
                    {
                            
            ?>


                            <div class="box" category-dropdown="<?php echo $row['category']; ?>">
                                <a href="ProductDetails.php?id=<?php echo $row['supplementID']; ?>">
                                <img src="<?php echo $row["picture"]; ?>" alt="" >
                                    <h3><?php echo $row["supplementName"]; ?></h3>
                                    <h5><?php echo $row["flavor"]; ?></h5>
                                    <span>Rs.<?php echo $row["price"]; ?>.00/=</span>
                                </a>
                            </div>


            <?php
                    }
                }
                mysqli_close($con);//close the connection
            ?>
        </div>
    </section>
    <br><br><br><br><br><br>
    <footer>
        <p>© 2023 Booker Gym</p>
    </footer>

</body>

</html>
