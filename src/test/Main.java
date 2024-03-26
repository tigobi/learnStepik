package test;

import examples.*;

public class Main {
    public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
        String name = s.substring(8, 12);
        int age = Integer.parseInt(s.substring(20, 22));
        Person john = new Person(name,age );
        System.out.println(john.getAge()+john.getName());
    }
}
