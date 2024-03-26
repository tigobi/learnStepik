package interfaces;

import Inheritance.AbleToRun;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbleToRun ableToRun = new Dog();
        Dog dog = (Dog) ableToRun;
        Director director = new Director();
        Programmist programmist = new Programmist();
        Cooker cooker = new Cooker();
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(programmist);
        workers.add(cooker);
        for (Worker worker : workers
        ) {
            worker.work();
        }
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmist);
        drivers.add(cooker);
        for (Driver driver : drivers
        ) {
            driver.drive();
        }
    }
}
