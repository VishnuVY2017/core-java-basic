package com.core.java.dsa.arrays;

import java.util.Arrays;

// find the index of max element.
public class Find_index_of_max_element {

    public static int maxIndex(int arr[]) {

        int maxIndex = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int arr[] = {90, 110, 10, 20, 30, 350, 40, 50, 70, 80};

        System.out.println(Arrays.toString(arr));
        System.out.println("========Max Index==========");
        int maxIndex = maxIndex(arr);
        System.out.println("max Index value : " + arr[maxIndex]);
    }
}


/*
// Time Complexity - O(n)
// Aux Space - O(1)
 */