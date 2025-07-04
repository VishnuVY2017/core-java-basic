package com.core.java.dsa.arrays;


import java.util.Arrays;

// Reverse the array
// two pointers technique Best solutions
public class Reverse_The_Array_second {
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int tempArr = arr[start];
            arr[start] = arr[end];
            arr[end] = tempArr;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 70, 80};

        System.out.println(Arrays.toString(arr));
        System.out.println("==================");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
// Time Complexity - - O(n/2) / O(n)
// Aux Space - O(1)
 */
