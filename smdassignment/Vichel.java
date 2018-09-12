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
public abstract class Vichel implements Honda ,Suzuki ,Farari {
    
    private int modelNo;
    private String color;
    private String madeby;
    //   Here is the Constructor 
    Vichel(){
          this.modelNo=0;
          this.color=null;
    }
    
    Vichel(int mno,String c){
        this.modelNo=mno;
        this.color=c;
    } 
    
    //  Non abstract Methods 
    @Override
    public String printHonda()
    {
        return "Honda";
        // System.out.println("This Vichel is Made By Honda ");
    }
    @Override
    public String printSuzuki(){
        return "Suzuki";
       // System.out.println("This Vichel is Made By Suzuki ");
    }
    @Override
    public String printFarari(){
        return "Farari";
         //System.out.println("This Vichel is Made By Farari "); 
    }
    
    //  here are setters and getters 
    public int getModelNo()
    {
        return this.modelNo;
    }
    
    public String getColor(){
       return this.color;
    }
    
    public String getmadeBy()
    {
       return this.madeby;
    }
    public void setModelNo(int mno)
    {
        this.modelNo=mno;
    }
    public void setcolor(String c){
         this.color=c;
    }
    public void setmadeBy(String mby)
    {
        this.madeby=mby;
    }
    //   Abstract Method   Print the Vichel details 
    public abstract void printVichel();
}
