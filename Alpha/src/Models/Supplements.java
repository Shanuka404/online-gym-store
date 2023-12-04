/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Blob;

/**
 *
 * @author Cyber Park
 */
public class Supplements {
    private String supplementID;
    private String supplementName;
    private String category;
    private String picture;
    private String flavor;
    private String size;
    private double price;
    private String description;

    public Supplements(String supplementID, String supplementName, String category,String picture,
            String flavor, String size, double price, String description) {
        this.supplementID = supplementID;
        this.supplementName = supplementName;
        this.category = category;
        this.picture = picture;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        this.description = description;
    }

    public Supplements() {
    }

    public String getSupplementID() {
        return supplementID;
    }

    public String getSupplementName() {
        return supplementName;
    }

    public String getCategory() {
        return category;
    }

    public String getPicture() {
        return picture;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    
    
}




