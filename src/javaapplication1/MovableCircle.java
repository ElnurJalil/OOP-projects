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
public class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public void MoveUp() {
        center.MoveUp();
    }

    @Override
    public void MoveDown() {
        center.MoveDown();
      
    }

    @Override
    public void MoveRight() {
        center.MoveRight();
        
    }

    @Override
    public void MoveLeft() {
        center.MoveLeft();
        
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "center=" + center.toString() + ", radius=" + radius + '}';
    }
    
    
    
}
