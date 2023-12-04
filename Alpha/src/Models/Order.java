/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Cyber Park
 */
public class Order {
    private String orderID;
    private String CustomerAddress;
    private String CustomerEmail;
    private String SupplementID;
    private String CustomerID;
    private String CustomerName;
    private String CustomerNumber;
    private double totalPrice;

    public Order(String orderID, String CustomerAddress, String CustomerEmail, String SupplementID, 
            String CustomerID, String CustomerName, String CustomerNumber,double totalPrice) {
        this.orderID = orderID;
        this.CustomerAddress = CustomerAddress;
        this.CustomerEmail = CustomerEmail;
        this.SupplementID = SupplementID;
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerNumber = CustomerNumber;
        this.totalPrice=totalPrice;
    }

    public Order() {
    }
    

    public String getOrderID() {
        return orderID;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public String getSupplementID() {
        return SupplementID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    
}
