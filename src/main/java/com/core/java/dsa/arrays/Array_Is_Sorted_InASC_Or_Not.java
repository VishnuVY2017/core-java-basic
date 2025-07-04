package com.core.java.dsa.arrays;

import java.util.Arrays;
// Array is soretd in asc or not
public class Array_Is_Sorted_InASC_Or_Not {

    private static boolean isSortedASC(int[] arr) {

        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]> arr[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        //int arr[] = {90, 110, 10, 20, 30, 350, 40, 50, 70, 80};
        int arr[] = {10,11,15,13,14};

        System.out.println(Arrays.toString(arr));
        boolean maxElement = isSortedASC(arr);
        System.out.println( maxElement);
    }


}
