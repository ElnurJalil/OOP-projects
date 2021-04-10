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
public class Rectangle extends Shape {
    private double witdh;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double witdh, double length) {
        this.witdh = witdh;
        this.length = length;
    }

    public Rectangle(double witdh, double length, String color, boolean filled) {
        super(color, filled);
        this.witdh = witdh;
        this.length = length;
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        this.witdh = witdh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return witdh*length;
    }

    @Override
    double getPerimeter() {
       return 2*(witdh+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "witdh=" + witdh + ", length=" + length + '}';
    }

    
    
    
    
}
