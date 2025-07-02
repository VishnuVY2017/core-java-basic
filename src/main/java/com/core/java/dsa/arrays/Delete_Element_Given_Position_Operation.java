package com.core.java.dsa.arrays;

import java.util.Arrays;

public class Delete_Element_Given_Position_Operation {

    static void deleteElement(int[] arr, int position) {
        int n = arr.length;
        int index = position - 1;

        for (int i = index; i <= n - 2; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n-1] = 0;
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        System.out.println(Arrays.toString(arr));

        deleteElement(arr, 3);
        System.out.println(Arrays.toString(arr));

        deleteElement(arr, 3);
        System.out.println(Arrays.toString(arr));

    }
}

/**
 * Time Complexity O(N)
 * Space Complexity O(1)
 */
