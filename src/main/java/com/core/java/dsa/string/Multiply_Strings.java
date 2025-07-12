package com.core.java.dsa.string;

public class Multiply_Strings {
    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "54321";

        char[] charArray = s1.toCharArray();
        int sum1 = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum1 = (sum1 * 10) + (charArray[i] - '0');
            System.out.println(sum1);
        }

        char[] charArray2 = s2.toCharArray();
        int sum2 = 0;
        for (int i = 0; i < charArray2.length; i++) {
            sum2 = (sum2 * 10) + (charArray2[i] - '0');
            System.out.println(sum2);
        }
        System.out.println(sum2 * sum1);
    }
}
