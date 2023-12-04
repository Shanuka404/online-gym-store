/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Customer;
import ServiceLayer.CustomerService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRegisterController extends Customer {
    Customer Customer;
    CustomerService Service;
    
    public CustomerRegisterController(){
        Service = new CustomerService();
    }
    
    public Customer AddCustomers(String CustomerID, String CustomerName, String email, String password, String number, String address) {
        Customer = new Customer (CustomerID,CustomerName,email,password,number,address);

        return Customer;
    }

    public boolean AddCustomersToDataBase() {
        return Service.AddCustomers(Customer);
    }
    
    public boolean checkEmailExistence(Connection connection, String email) throws SQLException {
        String query = "SELECT COUNT(*) FROM customer WHERE email = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        return count > 0; // If count is greater than 0, email exists
    }
    public boolean checkPassword(Connection connection, String email, String password) throws SQLException {
        String query = "SELECT password FROM customer WHERE email = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            String storedPassword = resultSet.getString("password");
            return storedPassword.equals(password);
        }

        return false; // Email not found
    }
}
