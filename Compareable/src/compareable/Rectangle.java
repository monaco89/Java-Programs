/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compareable;

/**
 *
 * @author NickMonaco
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
private double width;
private double height;

public Rectangle() {
}

public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
}

public Rectangle(double width, double height, String color, boolean filled) {
    this.width = width;
    this.height = height;
    setColor(color);
    setFilled(filled);
}

public double getWidth() {
    return width;
}

public void setWidth(double width) {
    this.width = width;
}

public double getHeight() {
    return height;
}

public void setHeight(double height) {
    this.height = height;
}

@Override
public double getArea() {
    return width * height;
}

@Override
public double getPerimeter() {
    return 2 * (width + height);
}

/** Implement the compareTo method defined in Comparable */
@Override
public int compareTo(Rectangle o) {
    if (getArea() > ((Rectangle)o).getArea())
        return 1;
    else if (getArea() < ((Rectangle)o).getArea())
        return -1;
    else
        return 0;
}

}