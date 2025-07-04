package com.core.java.dsa.arrays;

import java.util.Arrays;

// find the min element from array

public class Find_the_index_of_min_element {

    private static int minElement(int[] arr) {
        int minElement = arr[0];
        for(int i = 1; i<=arr.length-1; i++){
            if(arr[i] < minElement){
                minElement = arr[i];
            }
        }

        return minElement;
    }

    public static void main(String[] args) {

        int arr[] = {90, 110, 10, 20, 30, 350, 40, 50, 70, 80};

        System.out.println(Arrays.toString(arr));
        System.out.println("========Min Index==========");
        int minElement = minElement(arr);
        System.out.println("max element value : " + minElement);
    }


}
