package com.core.java.dsa.arrays;

import java.util.Arrays;
// 217. Contains Duplicate
public class LeetCode_217_B {

    public static boolean containsDuplicate(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int n =arr.length-1;
        for(int i = 0; i<=n; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 80, 90, 70, 10};
        System.out.println(Arrays.toString(arr));

        boolean b = containsDuplicate(arr);
        System.out.println( b);
    }
}

/*
// Time Complexity - O(n log n)
// Aux Space - O(n)
 */
