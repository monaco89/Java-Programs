/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colorable;

/**
 *
 * @author NickMonaco
 */
public class Square extends GeometricObject implements Colorable 
{
    private double side;
    
    public Square () 
    {
    }

    @Override
    public void howToColor () 
    {
        System.out.println("Colorable");
    }
    
    @Override
    public double getArea()
    {
        return side * side;
    }
    
    @Override
    public double getPerimeter()
    {
        return side + side + side + side;
    }

}