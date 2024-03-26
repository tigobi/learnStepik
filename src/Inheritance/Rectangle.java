package Inheritance;

public class Rectangle extends Shape{

    public Rectangle(int a, int b) {
        super(a, b);
    }
    @Override
    public int getPerimeter(){
        return (a+b)*2;
    }
}

