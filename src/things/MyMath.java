package things;

public class MyMath {
    public static final double PI = 3.14;

    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return radius * radius * PI;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static int multiple(int a) {
        return a * a;
    }
}
