package com.core.java.java8.bypredicate;

import java.util.function.BiPredicate;

public class Demo8 {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> predicate1 = (num1, num2) -> num1 > num2;
        boolean mybool = predicate1.test(10, 20);
        System.out.println(mybool);

        BiPredicate<Integer, Integer> predicate2 = (num1, num2) -> num1 < num2;
        mybool = predicate2.test(10, 20);
        System.out.println(mybool);
    }
}