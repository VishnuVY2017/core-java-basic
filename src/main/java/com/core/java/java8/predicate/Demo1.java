package com.core.java.java8.predicate;

public class Demo1 {
    public static void main(String[] args) {
        Hello hello = (a, b) -> {
            System.out.println("Lambda Code Starts");
            try {
                int result = a / b;
                System.out.println("Result is " + result);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("Lambda Code Ends");
        };
        hello.test(50, 0 );
    }
}