/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Orkhan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Movable m1 = new MovablePoint(5,6,7,8);
        System.out.println(m1);
        m1.MoveLeft();
        System.out.println(m1);
        m1.MoveUp();
        System.out.println(m1);
        
         Movable m2 = new MovableCircle(5,5,5,5,5);
        System.out.println(m2);
        m2.MoveLeft();
        System.out.println(m2);
        m2.MoveUp();
        System.out.println(m2);
        
         Movable m3 = new MovableRectangle(5,5,5,5,5,5);
        System.out.println(m3);
        m3.MoveLeft();
        System.out.println(m3);
        m3.MoveUp();
        System.out.println(m3);
        
        ArrayList<String> a1 =  new ArrayList<>();
        a1.add("elnur");
        a1.add( "nehruz");
        a1.add( "murad");
        a1.add( "bizler");
        a1.add(1, "sizler");
        a1.remove("murad");
        a1.indexOf("sizler");
        a1.set(3, "elnur");
        System.out.println(a1);
        
                }
    
}
