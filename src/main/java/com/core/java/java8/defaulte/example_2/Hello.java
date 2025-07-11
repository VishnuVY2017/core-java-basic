package com.core.java.java8.defaulte.example_2;

public class Hello implements A, B {
    @Override
    public void show() {
        System.out.println("Hello- show() ");
    }

    public void test() {
        System.out.println("Hello- test() ");
        show();
        A.super.show();
        B.super.show();
    }
}