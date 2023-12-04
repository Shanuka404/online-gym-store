/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Models.WorkoutPlans;
import ServiceLayer.WorkoutPlanService;

public class AddWorkoutPlanController extends WorkoutPlans{
    WorkoutPlans WorkoutPlans;
    WorkoutPlanService Service;
    
    public AddWorkoutPlanController(){
        Service = new WorkoutPlanService();
    }
    
    public WorkoutPlans AddWorkoutPlans(String WorkoutPlanID, String category, String day1, String day2, String day3, String day4, String day5, String day6) {
        WorkoutPlans = new WorkoutPlans (WorkoutPlanID,category,day1,day2,day3,day4,day5,day6);

        return WorkoutPlans;
    }

    public boolean AddWorkoutPlanToDataBase() {
        return Service.AddWorkoutPlans(WorkoutPlans);
    }
}
