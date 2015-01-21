/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regularpolygontest;

/**
 *
 * @author NickMonaco
 */
public class RegularPolygonTest {

    public static void main(String[] args) 
    {
        RegularPolygon rp1 = new RegularPolygon(); 
        System.out.println("First polygon"); 
        System.out.println("Perimeter="+rp1.getPerimeter());
        System.out.println("Area="+rp1.getArea());
        System.out.println(); 

        RegularPolygon rp2 = new RegularPolygon(6,4); 
        System.out.println("Second polygon"); 
        System.out.println("Perimeter="+rp2.getPerimeter()); 
        System.out.println("Area="+rp2.getArea()); 
        System.out.println(); 

        RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8); 
        System.out.println("Third polygon"); 
        System.out.println("Perimeter="+rp3.getPerimeter());
        System.out.println("Area="+rp3.getArea());
        
    }
class RegularPolygon 
   { 
        private int n = 3; 
        private double side = 1; 
        private double x = 0; 
        private double y = 0; 

    public RegularPolygon(int newN, double newSide, double newX, double newY) 
    { 
        n = newN; 
        side = newSide; 
        x = newX; 
        y = newY; 
    } 

    public int getN() 
    { 
        return n; 
    } 

    public void setN(int newN) 
    { 
        n = newN; 
    } 

    public double getSide() 
    { 
        return side; 
    } 

    public void setSide(double newSide) 
    { 
        side = newSide; 
    } 

    public double getX() 
    { 
        return x; 
    } 

    public void setX(double newX) 
    { 
        x = newX; 
    } 

    public double getY() { 
        return y; 
    } 

    public void setY(double newY) 
    { 
        y = newY; 
    } 

    double getPerimeter() 
    { 
        return n * side; 
    } 

    double getArea() 
    { 
        return (n * side * side) / (4 * Math.tan(3.14159 / n)); 
    } 
   }    
}
