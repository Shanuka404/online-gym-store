/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DBLayer.DataBaseConnection;
import Models.Supplements;

public class SupplementsService {
    Supplements Supplements= new Supplements();
    private DataBaseConnection singleCon;
    public SupplementsService(){
        singleCon = DataBaseConnection.getSingleInstance();
    }
    public boolean AddSupplements(Supplements Sup){
        try {
            String querry = "insert into supplements values('"+Sup.getSupplementID()+"','"+
                                                                Sup.getSupplementName()+"','"+
                                                                Sup.getCategory()+"','"+
                                                                Sup.getPicture()+"','"+
                                                                Sup.getFlavor()+"','"+
                                                                Sup.getSize()+"','"+
                                                                Sup.getPrice()+"','"+
                                                                Sup.getDescription()+"')";
            boolean result = singleCon.ExecuteQuery(querry);
            return result;
        }catch (Exception ex){
            System.out.println("Cannot insert Supplements");
            return false;
        }
    }
    
}
