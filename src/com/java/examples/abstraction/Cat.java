package com.java.examples.abstraction;

public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}
