package Inheritance;

public abstract class Shape {
    int a;
    int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public final int getA() {
        return a;
    }

    public final int getB() {
        return b;
    }

    public final void showPerimeter(){
        System.out.println(getPerimeter());
    }
    public abstract int getPerimeter();
}
