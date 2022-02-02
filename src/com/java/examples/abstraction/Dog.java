package com.java.examples.abstraction;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}
