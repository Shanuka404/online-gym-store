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
public class Cart {
    private String CartID;
    private String SupplementID;
    private String SupName;
    private String CustomerID;
    private String pic;
    private double totalPrice;

    public Cart(String CartID, String SupplementID, String SupName, String CustomerID, String pic, double totalPrice) {
        this.CartID = CartID;
        this.SupplementID = SupplementID;
        this.SupName = SupName;
        this.CustomerID = CustomerID;
        this.pic = pic;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }
    

    public String getCartID() {
        return CartID;
    }

    public String getSupplementID() {
        return SupplementID;
    }

    public String getSupName() {
        return SupName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getPic() {
        return pic;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    
    
}
