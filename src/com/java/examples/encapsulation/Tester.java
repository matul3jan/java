package com.java.examples.encapsulation;

public class Tester {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Matul");
        student.setAge(25);

        /*
            Cannot access private properties from Student Class
            System.out.println(student.name);
            System.out.println(student.age);
         */

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
