package test;

import Inheritance.Cat;
import Inheritance.Lion;
import examples.Box;
import examples.WeightBox;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        WeightBox weightBox = new WeightBox(10, 100);
        box.showInfo();
        weightBox.showInfo();
    }
}
