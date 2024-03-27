package test;

import Inheritance.ColoredRects;
import Inheritance.Rectangle;
import Inheritance.Triangle;
import examples.Person;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(1,7);
            System.out.println(String.format("Ваше число %s",number));
        }
    }
}
