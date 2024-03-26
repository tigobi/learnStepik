package test;

import Inheritance.ColoredRects;
import Inheritance.Rectangle;
import Inheritance.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,5,6);
        triangle.showPerimeter();
        Rectangle rectangle = new Rectangle(10,7);
        rectangle.showPerimeter();
        ColoredRects coloredRect = new ColoredRects(10,10);
        coloredRect.showPerimeter();
    }
}
