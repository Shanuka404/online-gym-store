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
    <title>Purchase History</title>
    <link rel="stylesheet" href="Homestyle.css">
    <link rel="stylesheet" href="stylerate.css">
    <link rel="stylesheet" href="History.css">

    <header>
        <div class="logo">Booker Gym</div>
        <nav>
            <ul>
                <li><a href="Home.php">Home</a></li>
                <li><a href="Cart.php">Cart</a></li>
                <li><a href="rate.php">Rating</a></li>
                <li><a href="History.php">&#9733 History</a></li>
                <li><a href="Logout.php">Signout</a></li>
            </ul>
        </nav>
    </header>

</head>
<body>
    <br><br><br><br><br>
    <div class="cart">
        <div class="heading">
            <h2>Purchase History</h2>
        </div>
    </div>
    <br>
    <div class="cart">
        <div class="small-container">
            <table>
        
                <tr>
                    <th>Product</th>
                    <th>Name</th>
                    <th>Quantity</th>
                    <th>Price</th>
                </tr>
                <?php
                    //connect with database
                    $con = mysqli_connect("localhost","root","","bookergym","3306");
                        
                    //Error handling
                    if(!$con)
                    {
                        die("Sorry,We are facing a technical issue");
                    }

                    $email = $_SESSION["userName"];
                    $sql = "SELECT * FROM `history` WHERE cusID = (SELECT customerID FROM customer WHERE email = '$email')";
                   
                    //Execute the querry against the database
                    $result = mysqli_query($con,$sql);

                    if(mysqli_num_rows($result)>0)

                    
                    {
                        while($row = mysqli_fetch_assoc($result))
                        {
                            
                                
                            ?>
                                    <tr>
                                        <td>
                                            <div class="cart-info">
                                                <img src="<?php echo $row["picture"]; ?>">
                                            </div>
                                        </td>
                                        <td><?php echo $row["supplementName"]; ?></td>
                                        <td><?php echo $row["quantity"]; ?></td>
                                        <td>Rs.<?php echo $row["price"]; ?>.00/=</td>
                                    </tr>
                            <?php
                        }
                    }
                    mysqli_close($con);//close the connection
                ?>
            </table>
        </div>
    </div>
    <footer>
        <p>© 2023 Booker Gym</p>
    </footer>
</body>
</html>
