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
public class Car extends Vichel{

     private int noWheels;
     private int price;
     private String fuleType; 
     
    Car(int modelno,String color,String madeby,int nowheels,int p,String fuleType){
         this.setModelNo(modelno);
         this.setcolor(color);
         this.setmadeBy(madeby);
         this.noWheels=nowheels;
         this.price=p;
         this.fuleType=fuleType;
    }
    @Override
    public void printVichel() {
           
        
//        try{
//	    
//	}catch(){
//            System.out.println("The specified file is not " +
//			"present at the given path");
//	 }
          // String x=this.printHonda();    
           System.out.println("This is Car ");
           if(this.getmadeBy()=="Honda"){
                 System.out.println("Car is Made by :"+this.printHonda());
           }
           else if(this.getmadeBy()=="Farari")
           {
                 System.out.println("Car is Made by :"+this.printFarari());
           }
           else{
                 System.out.println("Car is Made by :"+this.printSuzuki());
           }
           System.out.println("model No: "+this.getModelNo());
           System.out.println("Color : "+this.getColor());
           System.out.println("No of Wheels : "+this.noWheels);
           System.out.println("Price :"+this.price);
           System.out.println("Fule Type:"+this.fuleType);    
    }
    
}
