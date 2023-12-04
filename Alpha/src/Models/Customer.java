/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cyber Park
 */
public class Customer {
    private String CustomerID;
    private String CustomerName;
    private String email;
    private String password;
    private String number;
    private String address;

    public Customer(String CustomerID, String CustomerName, String email, String password, String number, String address) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.email = email;
        this.number = number;
        this.address = address;
        this.password = password;
    }

    public Customer() {
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }
}
