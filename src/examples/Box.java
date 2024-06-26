package examples;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double size) {
        this(size, size, size);
    }

    public Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void showInfo() {
        System.out.println("Width: " + width + " Height " + height + " Length " + length);
    }

    public Box copy() {
        return new Box(length, width, height);
    }

    public Box increase() {
        return new Box(length * 2, width * 2, height * 2);
    }

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int compare(Box another) {
        double curVolume = getVolume();
        double anoVolume = another.getVolume();
        if (curVolume > anoVolume) {
            return 1;
        } else if (curVolume < anoVolume) {
            return -1;
        } else return 0;
    }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }
}
