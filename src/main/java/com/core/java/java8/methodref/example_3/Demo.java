package com.core.java.java8.methodref.example_3;

public class Demo {
    public static void main(String[] args) {

        Hello hello = (arr) -> {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        };

        int myarr1[] = {20, 40, 30, 50, 10};
        hello.test(myarr1);

        for (int x : myarr1) {
            System.out.println(x);
        }
        System.out.println("------------------");

    }
}
