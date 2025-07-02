package com.core.java.dsa.arrays;

public class Search_for_given_Element {

    private static int linearSearchFun(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {25, 10, 5, 15, 30, 20, 50};
        int element = 90;
        int index = linearSearchFun(arr, element);
        if (index == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found at Index : " + index);
    }
}

/**
 *  Time Complexity O(N)
 *  Space Complexity O(N)
 */
