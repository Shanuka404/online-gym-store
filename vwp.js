document.addEventListener("DOMContentLoaded", function() {
    var categories = ['beginners', 'intermediate', 'advanced'];

    categories.forEach(function(category) {
        fetchWorkoutPlans(category);
    });

    function fetchWorkoutPlans(category) {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                var workoutPlans = JSON.parse(this.responseText);
                renderWorkoutPlans(category, workoutPlans);
            }
        };
        xhttp.open("GET", "fetchWorkoutPlans.php?category=" + category, true);
        xhttp.send();
    }

    function renderWorkoutPlans(category, workoutPlans) {
        var container = document.getElementById(category + 'Plans');
        container.innerHTML = '';

        workoutPlans.forEach(function(plan) {
            var planElement = document.createElement('div');
            planElement.classList.add('workout-plan');
            planElement.innerHTML = `
                <h3>${plan.category} Plan</h3>          
                ${plan.day1 ? `<div class="daybox"><p><strong>Day 1:</strong></p>${getExerciseList(plan.day1)}` : ''}
                </div>
                ${plan.day2 ? `<div class="daybox"><p><strong>Day 2:</strong></p>${getExerciseList(plan.day2)}` : ''}
                </div>
                ${plan.day3 ? `<div class="daybox"><p><strong>Day 3:</strong></p>${getExerciseList(plan.day3)}` : ''}
                </div>
                ${plan.day4 ? `<div class="daybox"><p><strong>Day 4:</strong></p>${getExerciseList(plan.day4)}` : ''}
                </div>
                ${plan.day5 ? `<div class="daybox"><p><strong>Day 5:</strong></p>${getExerciseList(plan.day5)}` : ''}
                </div>
                ${plan.day6 ? `<div class="daybox"><p><strong>Day 6:</strong></p>${getExerciseList(plan.day6)}` : ''}
                </div>
            `;
            container.appendChild(planElement);
        });
    }

    function getExerciseList(exercises) {
        var exerciseList = exercises.split('\n').filter(Boolean);
        return exerciseList.map(exercise => `<p>${exercise}</p>`).join('');
    }
});
