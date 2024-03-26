package examples;

import java.util.ArrayList;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> names = getEmployees();
        for (String name : names
        ) {
            System.out.println(name);
        }
    }

    private static HashSet<String> getEmployees() {
        HashSet<String> employees = new HashSet<>();
        employees.add("Tikhon");
        employees.add("Vanya");
        employees.add("Kolya");
        employees.add("Slava");
        employees.add("Max");
        return employees;
    }
}