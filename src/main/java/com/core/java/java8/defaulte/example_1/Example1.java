package com.core.java.java8.defaulte.example_1;

public class Example1 {


    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.eating(); //Overriden method
        mydog.sleeping(); //Overriden method
        mydog.running(); //Overriden method
        mydog.thinking(); //Inherited default method

        System.out.println("===================");
        Cat mycat = new Cat();
        mycat.eating(); //Overriden method
        mycat.sleeping(); //Overriden method
        mycat.running(); //Inherited default method
        mycat.thinking(); //Overriden method

    }
}
