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
                        alert('Comment edited successfully!');
                        refreshComments(); // Reload comments after edit
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