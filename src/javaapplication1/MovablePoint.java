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
public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void MoveUp() {
    this.y+=this.ySpeed;
    }

    @Override
    public void MoveDown() {
        this.y-=this.ySpeed;

    }

    @Override
    public void MoveRight() {
        this.x+=this.xSpeed;
    }

    @Override
    public void MoveLeft() {
        this.x-=this.xSpeed;
        
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    
    
    
}
