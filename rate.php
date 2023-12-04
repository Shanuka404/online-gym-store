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

    <title>Rating</title>

    <link rel="stylesheet" href="stylerate.css">

    <link rel="stylesheet" href="stylesNavigation.css">

    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

    

    <style>
        body{
            
            background-image: url('Image/11.jpg'); /* Replace with the path to your image */
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            text-align: center;
        }

    .container {

        margin-bottom: 50px;

    }



    textarea {

    width: 500px;

    height: 80px;

    font-family: Georgia, 'Times New Roman', Times, serif;

}





button {

    margin-top: 10px;

    padding: 10px;

    font-size: 15px;

    border-radius: 10px;

}



.commentFrame {

    border: 10px solid #5a5555;

    margin-bottom: 10px;

    padding: 10px;

    background-color: #f7f7f7;

    border-radius: 5px;

}



.userName {

    font-weight: bold;

    font-size: 18px;

    margin-bottom: 5px;

    text-align: left;

}



.userComment {

    margin: 0;

    font-size: 15px;

    text-align: left;

}




i {

    font-size: 30px;

    text-align: end;

}
.icon-container {
    text-align: right;
}

.icon-container i {
    margin-left: 10px;
}


    </style>

</head>

<body>

    <header>

        <div class="logo">Booker Gym</div>

        <nav>

            <ul>

                <li><a href="Home.php">Home</a></li>

                <li><a href="Cart.php">Cart</a></li>

                <li><a href="rate.php">&#9733 Rating</a></li>

                <li><a href="History.php">History</a></li>

                <li><a href="Logout.php">Signout</a></li>

            </ul>

        </nav>

    </header>

    <main>

        <br><br><br><br>

        <div class="container">

            <h1>Review the BookerGym App</h1>

            <div class="rating" id="rating">

                <span class="star" data-star="1">&#9733;</span>

                <span class="star" data-star="2">&#9733;</span>

                <span class="star" data-star="3">&#9733;</span>

                <span class="star" data-star="4">&#9733;</span>

                <span class="star" data-star="5">&#9733;</span>

            </div>

            <br>

            <form id="myForm" onsubmit="handleSubmit(event)">

            <textarea id="comment" placeholder="Write a comment"></textarea>

            </form>

            <button id="submit">Submit</button>

            

        </div>



        <div class="container">

            <h1>All Comments</h1>

            <div id="commentsContainer">

                <!-- Comments will be displayed here using PHP -->

                <div class="commentFrame">

                <?php include 'view_comments.php'; ?>

            </div>
        </div>

        <button id="viewCommentsButton" onclick="viewComments()">View Comments</button>
        <button id="minimizeCommentsButton" onclick="minimizeComments()">Minimize Comments</button>

        <script>
            document.addEventListener('DOMContentLoaded', function() {
                // Hide comments initially
                const commentsContainer = document.getElementById('commentsContainer');
                commentsContainer.style.display = 'none';

                // Function to toggle visibility of comments
                function toggleComments() {
                    commentsContainer.style.display = (commentsContainer.style.display === 'none') ? 'block' : 'none';
                }

                // Function to minimize comments
                function minimizeComments() {
                    commentsContainer.style.display = 'none';
                }

                // Function to view comments
                function viewComments() {
                    commentsContainer.style.display = 'block';
                }

                // Attach event listeners to buttons
                const viewCommentsButton = document.getElementById('viewCommentsButton');
                viewCommentsButton.addEventListener('click', viewComments);

                const minimizeCommentsButton = document.getElementById('minimizeCommentsButton');
                minimizeCommentsButton.addEventListener('click', minimizeComments);
            });

            document.addEventListener('DOMContentLoaded', function() {
                const stars = document.querySelectorAll('.star');
                const comment = document.getElementById('comment');
                const submitButton = document.getElementById('submit');
                const message = document.getElementById('message');

                let selectedStar = 0;

                stars.forEach(star => {
                    star.addEventListener('click', () => {
                        selectedStar = star.dataset.star;
                        stars.forEach(s => s.style.color = s.dataset.star <= selectedStar ? 'gold' : 'white');
                    });
                });
                
                submitButton.addEventListener('click', () => {
                    const rating = selectedStar;
                    const userComment = comment.value;

                    if (rating && userComment) {
                        // Send data to server
                        const xhr = new XMLHttpRequest();
                        xhr.onreadystatechange = function() {
                            if (xhr.readyState === XMLHttpRequest.DONE) {
                                if (xhr.status === 200) {
                                    alert('Rating and comment submitted successfully!');
                                    document.getElementById("myForm").reset();
                                    
                                    let stars = document.getElementsByClassName("star");
                                    for (let i = 0; i < stars.length; i++) {
                                        stars[i].style.color = "#fff";
                                    }
                                    
                                } else {
                                    alert('Error submitting rating and comment.');
                                }
                            }
                        };
                        xhr.open('POST', 'ratecode.php', true);
                        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                        xhr.send(`rating=${rating}&comment=${encodeURIComponent(userComment)}`);
                        
                    } else {
                        alert('Please select a rating and provide a comment.');
                    }
                });

                // Function to handle editing comment
                function editComment(commentID) {
                    const newComment = prompt("Edit your comment:");
                    if (newComment !== null) {
                        // Send data to server for editing comment using AJAX
                        const xhr = new XMLHttpRequest();
                        xhr.onreadystatechange = function() {
                            if (xhr.readyState === XMLHttpRequest.DONE) {
                                if (xhr.status === 200) {
                                    alert('Comment Updated successfully!');
                                    header('rate.php');
                                } else {
                                    alert('Error editing comment.');
                                }
                            }
                        };
                        xhr.open('POST', 'edit_comment.php', true);
                        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                        xhr.send(`commentID=${commentID}&newComment=${encodeURIComponent(newComment)}`);
                    }
                }

                // Function to handle deleting comment
                function deleteComment(commentID) {
                    const confirmDelete = confirm("Are you sure you want to delete this comment?");
                    if (confirmDelete) {
                        // Send data to server for deleting comment using AJAX
                        const xhr = new XMLHttpRequest();
                        xhr.onreadystatechange = function() {
                            if (xhr.readyState === XMLHttpRequest.DONE) {
                                if (xhr.status === 200) {
                                    alert('Comment deleted successfully!');
                                    refreshComments(); // Reload comments after delete
                                } else {
                                    alert('Error deleting comment.');
                                }
                            }
                        };
                        xhr.open('POST', 'delete_comment.php', true);
                        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                        xhr.send(`commentID=${commentID}`);
                    }
                }

                // Attach event listeners to icons
                document.addEventListener('click', function(event) {
                    if (event.target.classList.contains('edit-button')) {
                        const commentID = event.target.dataset.commentId;
                        editComment(commentID);
                    } else if (event.target.classList.contains('delete-button')) {
                        const commentID = event.target.dataset.commentId;
                        deleteComment(commentID);
                    }
                });
            });
        </script>
    </main>

</body>



</html>

