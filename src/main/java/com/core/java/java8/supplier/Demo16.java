package com.core.java.java8.supplier;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Demo16 {
    public static void main(String[] args) {
        /*
        Supplier Functional Interfaces
         Supplier Functional Interface
            o Takes No Input Parameters
            o Returns Any Type .
             Supplier Functional Interface has the following methods.
            abstract T get();
         */
        Supplier<String> supplier1 = () -> "Hello Guys, How are you?";
        String str = supplier1.get();
        System.out.println(str);

        Supplier<Integer> supplier2 = () -> LocalDate.now().getDayOfMonth();
        System.out.println(supplier2.get());

        Supplier<DayOfWeek> supplier3 = () -> LocalDate.now().getDayOfWeek();
        DayOfWeek dow = supplier3.get();

        System.out.println(dow);
        System.out.println(dow.getValue());
    }
}