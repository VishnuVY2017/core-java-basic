package com.core.java.dsa.arrays;

import java.util.Arrays;

// Array is sorted in asc or not
public class Array_Is_Sorted_In_Desc_or_Not {

    private static boolean isSortedASC(int[] arr) {
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]< arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //int arr[] = {90, 110, 10, 20, 30, 350, 40, 50, 70, 80};
        int arr[] = {15,14,17,12,11};

        System.out.println(Arrays.toString(arr));
        boolean maxElement = isSortedASC(arr);
        System.out.println( maxElement);
    }
}
