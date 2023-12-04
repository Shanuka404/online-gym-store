/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import java.sql.*;

/**
 *
 * @author Cyber Park
 */
public class DataBaseConnection {
    private final String URL="jdbc:mysql://localhost:3306/bookergym";
    private final String UName="root";
    private final String Password="";
    private static DataBaseConnection Instance;
    private Connection con;
    
    private DataBaseConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(URL,UName,Password);
            System.out.println("DataBase Connection Success");
        }catch (ClassNotFoundException ex){
            System.out.println("Driver Class Error"+ex.getMessage());
        }catch (SQLException ex) {
            System.out.println("DataBase Connection Error"+ex.getMessage());
        }

    }
    public static DataBaseConnection getSingleInstance(){
        try {
            if (Instance==null){
                Instance = new DataBaseConnection();
            } else if (Instance.con.isClosed()) {
                Instance = new DataBaseConnection();
            }else {
                return Instance;
            }
            return Instance;
        }catch (SQLException ex){
            System.out.println("DataBase Connection Error"+ex.getMessage());
            return null;
        }
    }
    public boolean ExecuteQuery(String sqlQ){
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(sqlQ);
            return result > 0;
        }catch (SQLException ex){
            System.out.println("SQL Error"+ex.getMessage());
            return false;
        }
    }
}
