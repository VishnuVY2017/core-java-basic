package com.core.java.dsa.arrays.leetcode;

import java.util.Arrays;

//283. Move Zeroes
public class LeetCode_283 {

    //
    // int arr[] = {0, 20, 0, 10, 30, 0, 0, 90};
    //
    public static void moveZeroes(int[] arr) {

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 20, 0, 10, 30, 0, 0, 90, 99, 0,0,0,78};
        System.out.println(Arrays.toString(arr));

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}


// TC O(N)
//  SC O(1)