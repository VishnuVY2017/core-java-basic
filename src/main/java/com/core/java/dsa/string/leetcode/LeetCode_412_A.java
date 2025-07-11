package com.core.java.dsa.string.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_412_A {

    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            if (divBy3 && divBy5) {
                list.add("FizzBuzz");
            } else if (divBy5) {
                list.add("Fizz");
            } else if (divBy3) {
                list.add("Buzz");
            } else {
                list.add("" + i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<String> strings = fizzBuzz(3);
        System.out.println(strings);
    }
}
