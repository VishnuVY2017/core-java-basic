package com.core.java.dsa.arrays.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_1 {

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if((nums[i]+nums[j]) == target){
                    return new int[]{i, j};
                }

            }
        }
        return null;
    }

    public static int[] twoSum_1(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], i);
        }

        for(int i = 0; i<arr.length; i++){
            int divide = target - arr[i];
            if(map.containsKey(divide) && map.get(divide) != i){
                return new int[]{i, map.get(divide)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        int[] ints = twoSum(arr, target);
        int[] ints1 = twoSum_1(arr, target);

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));

    }

}
