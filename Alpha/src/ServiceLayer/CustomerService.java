/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DBLayer.DataBaseConnection;
import Models.Customer;


public class CustomerService {
    Customer Customers= new Customer();
    private DataBaseConnection singleCon;
    public CustomerService(){
        singleCon = DataBaseConnection.getSingleInstance();
    }
    public boolean AddCustomers(Customer Cus){
        try {
            String querry = "insert into customer values('"+Cus.getCustomerID()+"','"+
                                                                Cus.getCustomerName()+"','"+
                                                                Cus.getEmail()+"','"+
                                                                Cus.getPassword()+"','"+
                                                                Cus.getNumber()+"','"+
                                                                Cus.getAddress()+"')";
            boolean result = singleCon.ExecuteQuery(querry);
            return result;
        }catch (Exception ex){
            System.out.println("Cannot insert Customer");
            return false;
        }
    }
}
