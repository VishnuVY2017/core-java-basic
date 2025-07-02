package com.core.java.dsa.arrays;

import java.util.Arrays;

//Delete the Element at given position in an Array

public class Delete_Element_From_Array {

    static int findIndexValue(int arr[], int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }

    private static void deleteElementFromArr(int[] arr, int index) {

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

        System.out.println(Arrays.toString(arr));
        int index = findIndexValue(arr, 30);
        if (index != -1)
            deleteElementFromArr(arr, index);
        System.out.println(Arrays.toString(arr));


        index = findIndexValue(arr, 90);
        if (index != -1)
            deleteElementFromArr(arr, index);
        System.out.println(Arrays.toString(arr));

        index = findIndexValue(arr, 50);
        if (index != -1)
            deleteElementFromArr(arr, index);
        System.out.println(Arrays.toString(arr));
    }


}

/**
 * Time Complexity O(N)
 * Space Complexity O(1)
 */
