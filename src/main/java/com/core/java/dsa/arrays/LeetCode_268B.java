package com.core.java.dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;

// Leetcode - 268
// using  2 pointer code
public class LeetCode_268B {

    private static int missingNumber(int[] arr) {

        int n = arr.length;

        int actualSum = 0;
        for (int x : arr) {
            actualSum = actualSum + x;
        }

        int expectedSum = n * (n + 1) / 2;

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = {3,0, 1};
        System.out.println(Arrays.toString(arr));

        int x = missingNumber(arr);
        System.out.println(x);
    }


}

// Space O(1)
// Time O(N)
