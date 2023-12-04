/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Cyber Park
 */
public class AutoGenerateIDController {
    
    public String generatesupID() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DataBase Connection Success");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from supplements");

            int count;
            int noOfRaw = 0;
            String LastSupID = null;

            while (rs.next()) {
                noOfRaw++;
                String SupID = rs.getString("supplementID");
                LastSupID = SupID;
            }
            if (noOfRaw < 1) {
                count = 1000;
            } else {
                count = Integer.parseInt(LastSupID.substring(3, 7));
                ++count;
            }

            return "SUP" + count;
        } catch (Exception e) {
        }
        return null;
    }
    
    public String generateWorkoutID() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DataBase Connection Success");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from workoutplans");

            int count;
            int noOfRaw = 0;
            String LastWorkID = null;

            while (rs.next()) {
                noOfRaw++;
                String WorkID = rs.getString("workoutID");
                LastWorkID = WorkID;
            }
            if (noOfRaw < 1) {
                count = 1000;
            } else {
                count = Integer.parseInt(LastWorkID.substring(3, 7));
                ++count;
            }

            return "WOP" + count;
        } catch (Exception e) {
        }
        return null;
    }
    
    public String generatsCustomerID() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DataBase Connection Success");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer");

            int count;
            int noOfRaw = 0;
            String LastCustomerID = null;

            while (rs.next()) {
                noOfRaw++;
                String CustomerID = rs.getString("customerID");
                LastCustomerID = CustomerID;
            }
            if (noOfRaw < 1) {
                count = 1000;
            } else {
                count = Integer.parseInt(LastCustomerID.substring(3, 7));
                ++count;
            }

            return "CUS" + count;
        } catch (Exception e) {
        }
        return null;
    }
    
}
