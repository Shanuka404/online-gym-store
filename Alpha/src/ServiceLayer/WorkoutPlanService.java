/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DBLayer.DataBaseConnection;
import Models.WorkoutPlans;

public class WorkoutPlanService {
    
    WorkoutPlans WorkoutPlans= new WorkoutPlans();
    private DataBaseConnection singleCon;
    public WorkoutPlanService(){
        singleCon = DataBaseConnection.getSingleInstance();
    }
    public boolean AddWorkoutPlans(WorkoutPlans workout){
        try {
            String querry = "insert into workoutplans values('"+workout.getWorkoutPlanID()+"','"+
                                                                workout.getCategory()+"','"+
                                                                workout.getDay1()+"','"+
                                                                workout.getDay2()+"','"+
                                                                workout.getDay3()+"','"+
                                                                workout.getDay4()+"','"+
                                                                workout.getDay5()+"','"+
                                                                workout.getDay6()+"')";
            boolean result = singleCon.ExecuteQuery(querry);
            return result;
        }catch (Exception ex){
            System.out.println("Cannot insert workoutplans");
            return false;
        }
    }
    
}
