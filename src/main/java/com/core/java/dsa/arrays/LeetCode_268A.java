package com.core.java.dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;

// Leetcode - 268
// using has code
public class LeetCode_268A {

    private static int missingNumber(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int x:arr) {
            hashSet.add(x);
        }

        for(int i = 0; i<arr.length+1; i++){
            if(!hashSet.contains(i)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,0,1,4,6};
        System.out.println(Arrays.toString(arr));

        int x = missingNumber(arr);
        System.out.println(x);
    }


}
