package com.core.java.dsa.arrays.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

// 215. Kth Largest Element in an Array
public class LeetCode_215 {

    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pque = new PriorityQueue<>();
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
        int maxElement = findKthLargest(arr, 3);
        System.out.println("max element value : " + maxElement);
    }
}

/**
 *  Time Complexity O(n log k)
 *  Space Complexity O(k)
 *
 */