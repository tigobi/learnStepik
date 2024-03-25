package test;

import things.*;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        for (int i = 0; i<employees.getSize(); i++) {
            System.out.println(employees.get(i));

        }

    }

    private static MyArrayList getEmployees() {
       MyArrayList employees = new MyArrayList();
        employees.add("Tikhon");
        employees.add("Vanya");
        employees.add("Kolya");
        employees.add("Slava");
        employees.add("Max");
        return employees;
    }
}
