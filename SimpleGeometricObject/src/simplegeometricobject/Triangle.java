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
public class Triangle 
    extends SimpleGeometricObject 
{

    public static void main(String[] args) {
       
    }
    
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
    
    public Triangle()
    {
        
    }
    
    public Triangle(double side1,double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1()
    {
        return side1;
    }
    
    public double getSide2()
    {
        return side2;
    }
    
    public double getSide3()
    {
        return side3;
    }
    
    public double getArea()
    {
        double a = (side1 + side2 + side3) / 2;
        return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
    }
    
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    
    @Override
    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2
                + " side3 = " + side3;
    }
}
