package com.core.java.dsa.arrays.leetcode;

import java.util.Arrays;
//217. Contains Duplicate
public class LeetCode_217 {

    public static boolean containsDuplicate(int[] arr) {

        int n =arr.length-1;
        for(int i = 0; i<=n; i++){
            for(int j = i+1; j<=n; j++){
                if(arr[i] ==arr[j])
                    return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));

        boolean b = containsDuplicate(arr);
        System.out.println( b);
    }
}

/*
// Time Complexity - O(n^2) // not the good code.
// Aux Space - O(1)
 */
