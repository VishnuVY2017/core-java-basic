package com.core.java.dsa.string.leetcode;


// 345. Reverse Vowels of a String
public class LeetCode_345 {

    public static boolean isVowel(char ch) {
        return ch == 'a'
                || ch == 'e'
                || ch == 'i'
                || ch == 'o'
                || ch == 'u'
                || ch == 'A'
                || ch == 'E'
                || ch == 'I'
                || ch == 'O'
                || ch == 'U';
    }

    public static String reverseVowels(String s) {

        char strArr[] = s.toCharArray();
        int n = strArr.length;
        int start = 0;
        int end = n-1;

        while (start < end) {
            while (start < n && !isVowel(strArr[start])) {
                start++;
            }
            while (end >= 0 && !isVowel(strArr[end])) {
                end--;
            }

            if (start < end) {
                char temp = strArr[start];
                strArr[start] = strArr[end];
                strArr[end] = temp;
            }
            start++;
            end--;
        }

        return new String(strArr);
    }

    public static void main(String[] args) {

        String str = "IceCreAm"; // "AceCreIm"
        System.out.println(str);
        String s = reverseVowels(str);
        System.out.println(s);


    }

}
