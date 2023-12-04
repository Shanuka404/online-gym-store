/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Supplements;
import ServiceLayer.SupplementsService;

public class AddSupplementController extends Supplements{
    Supplements Supplements;
    SupplementsService Service;
    
    public AddSupplementController(){
        Service = new SupplementsService();
    }
    
    public Supplements AddSupplements(String supplementID, String supplementName, String category,String picture,
            String flavor, String size, double price, String description) {
        Supplements = new Supplements (supplementID,supplementName,category,picture,
            flavor,size,price,description);

        return Supplements;
    }

    public boolean AddSupplementsToDataBase() {
        return Service.AddSupplements(Supplements);
    }
}