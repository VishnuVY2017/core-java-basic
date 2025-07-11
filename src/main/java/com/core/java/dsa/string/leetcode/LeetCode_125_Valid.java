package com.core.java.dsa.string.leetcode;

public class LeetCode_125_Valid {

    public static String trimString(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static boolean isPalindrome(String s) {

        String s1 = trimString(s);
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

        String trimStr = trimString(str);
        System.out.println(str);
        System.out.println(isPalindrome(trimStr));
        System.out.println(trimStr);

    }
}
