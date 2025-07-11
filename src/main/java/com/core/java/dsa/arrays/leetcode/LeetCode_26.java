package com.core.java.dsa.arrays.leetcode;

// 26. Remove Duplicates from Sorted Array
import java.util.Arrays;

public class LeetCode_26 {

    public static int removeDuplicates(int arr[]){

        int k = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[k-1]){
                arr[k] = arr[i];
                k++;
            }
        }

        for(int i = k; i<arr.length; i++){
            arr[i] = 0;
        }

        return k;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,20,30,40,50,50,50,30,40,50,60};

        System.out.println(Arrays.toString(arr));
        int k = removeDuplicates(arr);
        System.out.println(k);
        System.out.println(Arrays.toString(arr));
    }
}

// o(N)
// o(1)