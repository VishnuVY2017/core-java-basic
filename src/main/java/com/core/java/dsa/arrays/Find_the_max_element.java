package com.core.java.dsa.arrays;

import java.util.Arrays;
// Find the max element;
public class Find_the_max_element {

    public static int maxElement(int arr[]){

        int maxElement = arr[0];
        for(int i = 1; i<=arr.length-1; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }

        return maxElement;

    }

    public static void main(String[] args) {

        int arr[] = {90, 110, 10, 20, 30, 350, 40, 50, 70, 80};

        System.out.println(Arrays.toString(arr));
        System.out.println("========Max Index==========");
        int maxElement = maxElement(arr);
        System.out.println("max element value : " + maxElement);
    }
}
