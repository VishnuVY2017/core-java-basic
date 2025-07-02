package com.core.java.dsa.arrays;

import java.util.Arrays;

public class Update_The_Element_Given_Position {

    private static void updateElement(int[] arr, int position, int element) {
        arr[position-1] = element;
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

        updateElement(arr, 3, 98);
        System.out.println(Arrays.toString(arr));

        updateElement(arr, 5, 110);
        System.out.println(Arrays.toString(arr));
    }


}
