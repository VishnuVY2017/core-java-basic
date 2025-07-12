package com.core.java.dsa.arrays.leetcode;

public class Find_K_Index {

    private static int getIndexVal(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6};
        int target = 9;

        System.out.println(getIndexVal(arr, target));
    }
}
