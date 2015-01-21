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
public class Main {

    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];

        objects[0] = new Square();
        objects[1] = new GeometricObject();
        objects[2] = new Square();
        objects[3] = new GeometricObject();
        objects[4] = new Square();

        for (int i = 0; i < objects.length; i++) 
        {
            GeometricObject object = objects[i];
            System.out.print("Object[" + i + "] ");
            
            if (object instanceof Colorable) 
            {
                Colorable colorable = (Colorable) object;
                colorable.howToColor();
            } 
            else 
            {
                System.out.println(" Not colorable");
            }
        }
    }
}

