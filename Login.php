    <!DOCTYPE html>
<html>
    <head>
        <title>Login Form Design</title>
        <link rel="stylesheet" type="text/css" href="Login.css">
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
        <style>
            .loginbox{
                position: relative;
                width: 800px;
                height: 600px;
                background: transparent;
                border: 2px solid white;
                box-shadow: 0 0 25px white;
                overflow: hidden;
                margin: 50px;
            }
            .loginbox .form-box.register form{
                margin-left: 120px;
            }
        </style>
        <script>
            function validateEmail()
            {
                let email=document.getElementById("txtEmail1").value;
                let at=email.indexOf("@");
                let dt=email.lastIndexOf(".");
                let len=email.length;
                if ((at<2) || (dt-at<2) || (len-dt<2))
                    {
                        alert("Please Enter a valid Email address !!!");
                        return false;
                    }
                return true;
            }
            function validatePassword()
            {
                var password = document.getElementById("txtPassword1").value;
                var confirmPassword = document.getElementById("confirmPassword").value;
                let pass=document.getElementById("txtPassword1").value;
                if (pass.length < 8)
                {
                    alert("Please Enter a Password with 8 characters !!!");
                    return false;
                }else if (password != confirmPassword) {
                    alert("Passwords do not match. Please try again.");
                    return false;
                }
                
                return true;
                
            }

            function validateAll()
            {
                if (validateEmail() && validatePassword())
                    {
                        alert("Reservation Added !!!");
                        return true;
                    }
                else
                    {
                        event.preventDefault();
                        return false;
                    }
            }
            
	    </script>   
    </head>
    <body>
        <div class="loginbox">
            <span class="bg-animate"></span>
            <span class="bg-animate2"></span>

            <div class="form-box login">
                
                <form action="LoginHandler.php" method="post" >
                    <div class="input-box animation" style="--i:1; --j:21" >
                        <input type="text" id="txtEmail" name="txtEmail" required>
                        <label>Email</label>
                        <i class='bx bxs-user' ></i>
                        </div>
                        <div class="input-box animation" style="--i:2; --j:22">
                        <input type="password" id="txtPassword" name="txtPassword" required>
                        <label>password</label>
                        <i class='bx bxs-lock-alt' ></i>
                        </div>
                        
                        <button type="submit" id="btnSubmitL" name="btnSubmitL" class="btn animation" style="--i:3; --j:23">Login</button>
                        <div class="logreg-link animation" style="--i:4; --j:24">
                        <p>Don't have an account? <a href="#"
                        class="register-link">Sign up</a></p>
                    </div>

                </form>
            </div>
            <div class="info-text login">
                <h2 class="animation" style="--i:0; --j:20">Booker Gym</h2><br>
                <h1 class="animation" style="--i:0; --j:20">Login</h1>
            </div>
            <div class="form-box register">
                
            <form action="RegistrationHandler.php" method="post" onsubmit="return validateAll()">


                    <div class="input-box animation" style="--i:18; --j:1">
                        <input type="text" id="txtName" name="txtName" required>
                        <label>Username</label>
                        <i class='bx bxs-user' ></i>
                        </div>
                        <div class="input-box animation" style="--i:19; --j:2">
                            <input type="text" id="txtEmail1" name="txtEmail1" required>
                            <label>Email</label>
                            <i class='bx bxs-envelope'></i>
                            </div>
                        <div class="input-box animation" style="--i:20; --j:3">
                        <input type="password" id="txtPassword1" name="txtPassword1" required>
                        <label>password</label>
                        <i class='bx bxs-lock-alt' ></i>
                        </div>
                        
                        <div class="input-box animation" style="--i:2; --j:22">
                        <input type="password" id="confirmPassword" name="confirmPassword" required>
                        <label>Confirm password</label>
                        <i class='bx bxs-lock-alt' ></i>
                        </div>

                        <div class="input-box animation" style="--i:2; --j:22">
                        <input type="text" id="txtTphone" name="txtTphone" required>
                        <label>Number</label>
                        <i class='bx bxs-phone'></i>
                        </div>

                        <div class="input-box animation" style="--i:2; --j:22">
                        <input type="text" id="txtaddress" name="txtaddress" required>
                        <label>Address</label>
                        <i class='bx bxs-home'></i>
                        </div>
                        <button type="submit" id="btnSubmit" name="btnSubmit" class="btn animation" style="--i:21; --j:4" onsubmit="return validateAll()">Sign Up</button>
                        <div class="logreg-link animation" style="--i:22; --j:5">
                        <p>Already have an account? <a href="#"
                        class="login-link">Login</a></p>
                    </div>
                </form>
            </div>
            <div class="info-text register">
                <h2 class="animation" style="--i:17; --j:0">Booker Gym</h2><br>
                <h1 class="animation" style="--i:17; --j:0">Sign Up</h1>
            </div>
            
        </div>

          
        <script src="Login.js"></script>
            
         

    </body>
</html>