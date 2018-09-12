/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smdassignment;

/**
 *
 * @author WAQAR AHMAD
 */
public class SMDassignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vichel myCar=new Car(1234,"Black","Honda",4,100000000,"Diesle");
        myCar.printVichel();
        Vichel myBike=new Bike(1234,"Red","Farari",2,123456,"Diesle");
        myBike.printVichel();
    }
    
}
