package com.core.java.java8.defaulte.example_4;

public interface B extends A {
    default void m2() {
        System.out.println("B- m2() ");
        m1();
    }
}