package com.core.java.java8.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo15 {
    // Consumer and BiConsumer Interfaces
    /*
     Consumer Functional Interface
        o Takes One Input Parameter
        o No Return Value.
         Consumer Functional Interface has the following methods.
        abstract void accept(T); //SAM
        Consumer<T> andThen(Consumer<? super T>);
         BiConsumer Functional Interface
        o Takes Two Input Parameters
        o No Return Value.
         BiConsumer Functional Interface has the following methods.
        abstract void accept(T, U);
        BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U>);
     */
    public static void main(String[] args) {
        Consumer<String> consumer1 = (input) -> System.out.println(input.toUpperCase());
        consumer1.accept("Hello");
        consumer1.accept("Srinivas");
        consumer1.accept("Hai");

        BiConsumer<String, String> consumer2 = (input1, input2) -> System.out.println(input1 + input2);
        consumer2.accept("Hello", " Guys");
    }
}