/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complex;

/**
 *
 * @author NickMonaco
 */
public class TestComplex 
{
    public static void main(String[] args)
    {
        double a = 3.5;
        double b = 5.5;
        Complex c1 = new Complex(a,b);
        
        double c = -3.5;
        double d = 1.0;
        Complex c2 = new Complex(c,d);
        
        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "|" + " = " + c1.abs());
    }
}

class Complex
{
    private double a, b;
    private double i;
    
    public Complex()
    {
        this.a = 0;
        this.b = 0;
    }
    
    public Complex(double a,double b)
    {
        this.a = a;
        this.b = b;
    }
    
    public Complex(double a)
    {
        
    }
    
    public double add(Complex c2) 
    { 
        this.a += c2.a; 
        this.b += c2.b;
        
       
    } 
    
    public double subtract(Complex c2) 
    { 
        this.a -= c2.a; 
        this.b -= c2.b; 
    } 
    
    public double multiply(Complex c2)
    { 
        this.a = this.a * c2.a - this.b * c2.b; 
        this.b = this.a * c2.b + this.b - c2.a; 
    }
    
    public double divide(Complex c2)
    {
        this.a = (this.a * c2.a + this.b * c2.b)/(c2.a * c2.a + c2.b * c2.b);
        this.b = (this.a * c2.b*-1+ this.b * c2.a)/(c2.a * c2.a + c2.b * c2.b);
        
    }
    
    public double abs()
    {
        return Math.abs(this.a,this.b);
    }
    
    public String toString()
    { 
        return a + " + " + b + "i"; 
    } 
}
