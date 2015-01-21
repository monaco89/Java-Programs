/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplegeometricobject;

/**
 *
 * @author NickMonaco
 */
public class Test 
{
    
    public static void main(String[] args) 
    {
       double side1 = 33;
       double side2 = 20; 
       double side3 = 15;
       
       String color = "red";
       
       boolean filled = true;
       
       Triangle triangle = new Triangle(side1, side2, side3);
       
       triangle.setColor(color);
       triangle.setFilled(filled);
       
       System.out.println("The area is: " + triangle.getArea());
       System.out.println("The perimeter is: " +  triangle.getPerimeter());
       System.out.println(triangle);
    }
    
}
