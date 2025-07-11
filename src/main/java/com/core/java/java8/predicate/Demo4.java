package com.core.java.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (num) -> {
            System.out.println(num);
            return num % 2 == 0;
        };
        Predicate<Integer> predicate2 = (num) -> num % 2 != 0;
        List<Integer> mylist1 = new ArrayList<>();
        mylist1.add(20);
        mylist1.add(21);
        mylist1.add(22);
        mylist1.add(23);
        mylist1.add(24);
        mylist1.add(25);
        mylist1.add(26);

        System.out.println(mylist1);
        mylist1.removeIf(predicate1);
        System.out.println(mylist1);

        System.out.println("-------------------------");
        List<Integer> mylist2 = new ArrayList<>();
        mylist1.add(20);
        mylist1.add(21);
        mylist1.add(22);
        mylist1.add(23);
        mylist1.add(24);
        mylist1.add(25);
        mylist1.add(26);
        System.out.println(mylist2);
        mylist2.removeIf(predicate2);
        System.out.println(mylist2);
    }
}