package com.core.java.dsa.arrays;

import java.util.Arrays;

// Rotate the element left-side by 1
// clock wise rotation


public class Rotate_The_elements_right_to_left {

    public static void rotateOfRight_1(int arr[]) {
        int n = arr.length;
        int x = arr[n-1];
        for (int i = n-1; i >=1; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arr));
        rotateOfRight_1(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/**
 * Time Complexity O(N)
 * Space Complexity O(1)
 */