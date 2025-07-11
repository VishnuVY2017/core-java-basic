package com.core.java.dsa.string.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_12 {

    static final int[] myValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static final String[] mysymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<myValues.length; i++){

            while(num >= myValues[i]){
                num = num - myValues[i];
                sb.append(mysymbols[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int roman = 53;
        System.out.println(intToRoman(roman));

    }
}
