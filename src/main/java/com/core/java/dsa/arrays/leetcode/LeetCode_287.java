package com.core.java.dsa.arrays.leetcode;

import java.util.Arrays;

// 287. Find the Duplicate Number
public class LeetCode_287 {

    public static int containsDuplicate(int[] arr) {

        int n =arr.length-1;
        for(int i = 0; i<=n; i++){
            for(int j = i+1; j<=n; j++){
                if(arr[i] ==arr[j])
                    return arr[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 50};
        System.out.println(Arrays.toString(arr));

        int b = containsDuplicate(arr);
        System.out.println( b);
    }
}

/*
// Time Complexity - O(n^2) // not the good code.
// Aux Space - O(1)
 */
