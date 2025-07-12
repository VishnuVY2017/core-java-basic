package com.core.java.dsa.arrays;

import java.util.Arrays;

public class MergeTwo_Sorted_array {

    private static int[] mergerTwoArray(int[] arr1, int[] arr2) {

        int result[] = new int[arr1.length + arr2.length];
        int first = arr1.length-1;
        int second = arr2.length-1;
        int n = result.length-1;

        while (first >= 0 && second >= 0){
            if(arr1[first] > arr2[second]){
                result[n] = arr1[first];
                first--;
            } else{
                result[n] = arr2[second];
                second--;
            }
            n--;
        }

        while (first>=0){
            result[n] = arr1[first];
            first --;
            n--;
        }

        while (second>=0){
            result[n] = arr2[second];
            second--;
            n--;
        }

        return result;
    }


    public static void main(String[] args) {
        int arr2[] = {1,5,8,90,100};
        int arr1[] = {110,120,150,190,210};

        int result[] = mergerTwoArray(arr1, arr2);
        System.out.println(Arrays.toString(result));

        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }


}
