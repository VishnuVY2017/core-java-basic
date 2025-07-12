package com.core.java.java8.byFunction;

import java.util.function.BiFunction;

public class Demo {
    /*
    BiFunction Functional Interface
        o Takes Two Input Parameters
        o Returns Output after processing.
     BiFunction Functional Interface has the following methods.
    abstract R apply(T, U); //SAM
    <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V>);
     */

    public static void main(String[] args) {
        BiFunction<String, String, String> fun1 = (input1, input2) -> input1 + input2;
        String output = fun1.apply("Hello", " Guys");
        System.out.println(output);

        BiFunction<Integer, Integer, Integer> fun2 = (num1, num2) -> num1 * num2;
        System.out.println(fun2.apply(5, 25));

        BiFunction<Integer, Integer, String> fun3 = (num1, num2) -> {
            int result = num1 * num2;
            String str = "Result is " + result;
            return str;
        };
        System.out.println(fun3.apply(5, 25));
    }
}
