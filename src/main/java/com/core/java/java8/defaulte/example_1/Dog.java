package com.core.java.java8.defaulte.example_1;

public class Dog implements Animal {
    @Override
    public void eating() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleeping() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void running() {
        System.out.println("Dog is running");
    }
}
