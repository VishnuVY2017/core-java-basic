package com.core.java.dsa.arrays;

import java.util.Arrays;

// Rotate the element left-side by 1
// anti-clock wise rotation


public class Rotate_The_elements_left_to_right {

    public static void rotateOfLeft1(int arr[]) {
        int n = arr.length;
        int x = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = x;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arr));
        rotateOfLeft1(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/**
 * Time Complexity O(N)
 * Space Complexity O(1)
 */