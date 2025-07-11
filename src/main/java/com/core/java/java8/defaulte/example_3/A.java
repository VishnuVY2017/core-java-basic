package com.core.java.java8.defaulte.example_3;

public interface A {
    default void m1() {
        System.out.println("A- m1() ");
    }

    default void m2() {
        System.out.println("A- m2() ");
        m1();
    }

    /* // Can not be override object class method.
    default boolean equals(Object obj) {
        System.out.println("A- equuals() ");
    */

}