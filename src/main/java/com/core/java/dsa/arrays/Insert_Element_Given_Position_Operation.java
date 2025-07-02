package com.core.java.dsa.arrays;

import java.lang.ref.SoftReference;
import java.util.Arrays;

public class Insert_Element_Given_Position_Operation {

    static void insertElement(int[] arr, int position, int element){
        int n = arr.length-1;
        int index = position-1;

        for(int i=n; i>index; i--){
            arr[i] = arr[i-1];
        }

        arr[index] = element;
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        System.out.println(Arrays.toString(arr));

        insertElement(arr, 3, 45);
        System.out.println(Arrays.toString(arr));

        insertElement(arr, 3, 45);
        System.out.println(Arrays.toString(arr));

        insertElement(arr, 3, 45);
        System.out.println(Arrays.toString(arr));

        insertElement(arr, 3, 90);
        System.out.println(Arrays.toString(arr));
    }
}

/**
 *  Time Complexity O(N)
 *  Space Complexity O(1)
 *  when there is no space to insert , then this algo will not work
 */
