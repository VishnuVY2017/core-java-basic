package com.core.java.dsa.string.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_13 {

    static Map<String, Integer> myMap = new HashMap<>();
    static {
        myMap.put("I", 1);
        myMap.put("V", 5);
        myMap.put("X", 10);
        myMap.put("L", 50);
        myMap.put("C", 100);
        myMap.put("D", 500);
        myMap.put("M", 1000);
    }
    public static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        int i = 0;
        while (i < n) {

            String currSymbol = String.valueOf(s.charAt(i));
            int currValue = myMap.get(currSymbol);

            int nextVal = 0;
            if (i + 1 < n) {
                String nextSymbol = String.valueOf(s.charAt(i + 1));
                 nextVal = myMap.get(nextSymbol);
            }

            if (currValue >= nextVal) {
                sum = sum + currValue;
                i = i + 1;
            } else {
                sum = sum + (nextVal - currValue);
                i = i + 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String roman = "LVIII";
        System.out.println(romanToInt(roman));

    }
}
