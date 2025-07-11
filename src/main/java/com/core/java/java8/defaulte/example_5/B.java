package com.core.java.java8.defaulte.example_5;

public interface B extends A {
    default void m1() {
        System.out.println("B- m1() ");
    }

    default void m2() {
        System.out.println("B- m2() ");
        m1();
    }
}