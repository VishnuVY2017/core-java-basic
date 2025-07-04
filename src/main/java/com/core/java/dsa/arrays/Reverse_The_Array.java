package com.core.java.dsa.arrays;


import java.util.Arrays;

// Reverse the array
public class Reverse_The_Array {
    public static int[] reverse(int arr[]) {
        int n = arr.length;
        int revArr[] = new int[n];

        for (int i = n - 1, j = 0; j< n; i--, j++) {
            revArr[i] = arr[j];
            System.out.println(revArr[i]);
        }
        return revArr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        System.out.println(Arrays.toString(arr));
        System.out.println( "==================");
        int[] reverse = reverse(arr);
        System.out.println(Arrays.toString(reverse));

    }
}


/*
// Time Complexity - O(n)
// Aux Space - O(n)
 */