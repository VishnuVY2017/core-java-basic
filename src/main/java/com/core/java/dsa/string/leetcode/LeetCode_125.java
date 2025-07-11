package com.core.java.dsa.string.leetcode;

public class LeetCode_125 {

    public static boolean isPalindrome(String s) {

        int n = s.length();
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {

         String str = "A man, a plan, a canal: Panama";
        // String str = "abcbaz";

        System.out.println(isPalindrome(str));

    }
}
