package com.core.java.java8.lambda.example_1;

public class Demo {

    public static void main(String[] args) {
        Hello hello = (name) -> {
            System.out.println("Hello " + name + " Welcome to Lambda World!!!");
        };

        hello.display("Vishnu");
        Hello hello2 = (name) -> System.out.println("Hello " + name + " Welcome to Lambda World!!!");

        hello2.display("Sharma");

        Hello hello3 = name -> System.out.println("Hello " + name + " Welcome to Lambda World!!!");

        hello3.display("Mistry");
    }
}