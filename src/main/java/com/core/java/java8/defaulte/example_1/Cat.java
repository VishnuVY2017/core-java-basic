package com.core.java.java8.defaulte.example_1;

public class Cat implements Animal {
    @Override
    public void eating() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleeping() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void thinking() {
        System.out.println("Cat is thinking");
    }
}