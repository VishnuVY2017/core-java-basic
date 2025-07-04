package com.core.java.dsa.arrays;

import java.util.Arrays;
// Find the unique Element (single number )
public class LeetCode_136 {

    public static int singleNumber(int[] nums) {

        int result = 0;
        for(int i = 0; i<nums.length; i++){
            result = result ^ nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {10,23,30,40,50,60,10,23,30,40,50};
        System.out.println(Arrays.toString(arr));

        int x = singleNumber(arr);
        System.out.println(x);

    }
}
