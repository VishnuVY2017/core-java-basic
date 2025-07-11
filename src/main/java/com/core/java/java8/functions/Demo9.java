package com.core.java.java8.functions;

import java.util.function.Function;

public class Demo9 {
    public static void main(String[] args) {
        Function<String, String> fun1 = (input) -> input.toUpperCase();
        String output1 = fun1.apply("Vishnu Sharma");
        System.out.println(output1);

        Function<String, Integer> fun2 = (input) -> Integer.parseInt(input);
        Integer output2 = fun2.apply("99");
        System.out.println(output2);

        Function<Integer, String> fun3 = (input) -> String.valueOf(input);
        String output3 = fun3.apply(99);
        System.out.println(output3);

        Function<String, String> fun4 = input -> input;
        String output4 = fun4.apply("Hello Guys");
        System.out.println(output4);

        Function<String, String> fun5 = Function.identity();
        String output5 = fun5.apply("Hello Guys");
        System.out.println(output5);
    }
}