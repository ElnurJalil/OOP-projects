/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Orkhan
 */
public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side,String color,boolean filled) {
        super(side, side,color,filled);
    }
      public Square(double side) {
        super(side, side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
     super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side); 
    }

    @Override
    public void setWitdh(double side) {
        super.setWitdh(side);
    }

    @Override
    public String toString() {
        return "Square{" +"tostring is"+ super.toString()+ '}';
    }
    
    
}
