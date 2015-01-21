/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricobject;


public class Triangle
{
    public static void main(String[] args)
    {
        TriangleNew triangle = new TriangleNew(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        
        System.out.println(triangle);
        System.out.println("the area is " + triangle.getArea());
        System.out.println("The perimeter is: " + triangle.getPerimeter());
        System.out.println(triangle);
    }
}

class TriangleNew extends GeometricObject {
    
    private double side1, side2, side3;
    
    public TriangleNew()
    {
        
    }
    
    public TriangleNew(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double side1()
    {
      return side1;  
    }
    
    public double side2()
    {
      return side2;  
    }
    
    public double side3()
    {
      return side3;  
    }
    
    @Override
    public double getArea()
    {
        double a = (side1 + side2 + side3) / 2;
        return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
    }
    
    @Override
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    
    @Override
    public String toString()
    {
        return "Triangle: side1 = " + side1 + "Triangle: side2 = " + side2 + "Triangle: side3 = " + side3;
    }
    
}
