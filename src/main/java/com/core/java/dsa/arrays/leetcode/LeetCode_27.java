package com.core.java.dsa.arrays.leetcode;

//Remove_The_Element_from_Array

import java.util.Arrays;

public class LeetCode_27 {

    public static int removeElement(int arr[], int element){

        int k = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != element){
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
        int arr[] = {10,20,30,40,30,50,30,60,30};

        System.out.println(Arrays.toString(arr));
        int k = removeElement(arr, 30);
        System.out.println(k);
        System.out.println(Arrays.toString(arr));
    }
}

// o(N)
// o(1)