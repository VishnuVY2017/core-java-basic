package com.core.java.java8.methodref.example_1;

public class Demo1 {
    public static void main(String[] args) {
        Hello hello1 = (a, b) -> {
            int sum = a + b;
            return sum;
        };

        int sum1 = hello1.test(100, 50);
        System.out.println("Sum : " + sum1);

        Hello hello2 = MyInteger::findSum;
        int sum2 = hello2.test(100, 50);
        System.out.println("Sum : " + sum2);

        Hello hello3 = Integer::sum;
        int sum3 = hello3.test(100, 50);
        System.out.println("Sum : " + sum3);

        Hello hello4 = Integer::max;
        int max = hello4.test(100, 50);
        System.out.println("Max : " + max);

        Hello hello5 = Integer::min;
        int min = hello5.test(100, 50);
        System.out.println("Min : " + min);

        System.out.println("Done!!!");
    }
}