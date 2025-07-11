package com.core.java.dsa.string.leetcode;

public class LeetCode_392 {

    public static boolean isSubsequence(String main, String sub) {

        int m = main.length();
        int n = sub.length();

        if (m < n)
            return false;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if(main.charAt(i) == sub.charAt(j)){
                j++;
            }
            i++;
        }

        return j==n;
    }


    public static void main(String[] args) {

        String main = "ahbgdc";
        String sub = "abc";

        boolean result = isSubsequence(main, sub);

        System.out.println(result);
    }

}
