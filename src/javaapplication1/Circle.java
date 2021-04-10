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
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
       return radius*Math.PI*radius;
       
    }

    @Override
    double getPerimeter() {
    return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

   
    
    
}
