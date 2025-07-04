package com.core.java.dsa.arrays;

import java.util.Arrays;
// Print the stream value from the array
public class Print_the_extream_array {

    private static void printExtream(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            if (start == end) {
                System.out.println(arr[start]);
            } else {
                System.out.println(arr[start]);
                System.out.println(arr[end]);
            }

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};

        System.out.println(Arrays.toString(arr));
        System.out.println("========Max Index==========");
        printExtream(arr);
    }
}
