/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cyber Park
 */
public class WorkoutPlans {
    private String WorkoutPlanID;
    private String category;
    private String day1;
    private String day2;
    private String day3;
    private String day4;
    private String day5;
    private String day6;

    public WorkoutPlans(String WorkoutPlanID, String category, String day1, String day2, String day3, String day4, String day5, String day6) {
        this.WorkoutPlanID = WorkoutPlanID;
        this.category = category;
        this.day1 = day1;
        this.day2 = day2;
        this.day3 = day3;
        this.day4 = day4;
        this.day5 = day5;
        this.day6 = day6;
    }

    public WorkoutPlans() {
    }

    public String getWorkoutPlanID() {
        return WorkoutPlanID;
    }

    public String getCategory() {
        return category;
    }

    public String getDay1() {
        return day1;
    }

    public String getDay2() {
        return day2;
    }

    public String getDay3() {
        return day3;
    }

    public String getDay4() {
        return day4;
    }

    public String getDay5() {
        return day5;
    }

    public String getDay6() {
        return day6;
    }
    
    
    
    
}
