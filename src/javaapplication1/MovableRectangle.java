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
public class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomright;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed) {
        topleft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomright = new MovablePoint(x2,y2,xSpeed,ySpeed);
        
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topleft=" + topleft.toString() + ", bottomright=" + bottomright.toString() + '}';
    }

    @Override
    public void MoveUp() {
      topleft.MoveUp();
      bottomright.MoveUp();
    }

   

    @Override
    public void MoveDown() {
        topleft.MoveDown();
        bottomright.MoveDown();
       
    }

    @Override
    public void MoveRight() {
      topleft.MoveRight();
      bottomright.MoveRight();
    }

    @Override
    public void MoveLeft() {
        topleft.MoveLeft();
        bottomright.MoveLeft();
      
    }
   
    }

      
    

