package com.core.java.dsa.arrays.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// 215. Kth Smallest Element in an Array
public class LeetCode_215_N {

    public static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pque = new PriorityQueue<>(Comparator.reverseOrder());
        for (int x : arr) {
            pque.add(x);
            if(pque.size() > k){
                pque.poll();
            }
        }

        return pque.peek();
    }

    public static void main(String[] args) {
        int arr[] = {90, 110, 10, 20, 30, 350, 40, 50, 70, 80};

        System.out.println(Arrays.toString(arr));
        System.out.println("========Max Index==========");
        int maxElement = findKthSmallest(arr, 1);
        System.out.println("max element value : " + maxElement);


        System.out.println("max element value : " + findKthSmallest(arr, 2));
        System.out.println("max element value : " + findKthSmallest(arr, 3));
        System.out.println("max element value : " + findKthSmallest(arr, 4));
    }
}

/**
 *  Time Complexity O(n log k)
 *  Space Complexity O(k)
 *
 */