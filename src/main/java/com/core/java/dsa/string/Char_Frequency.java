package com.core.java.dsa.string;

//Problem3- Frequency of each Character of given String with lower
// Alphabets in Sorted Order
public class Char_Frequency {

    private static void charFrequency(String str) {
        int n = str.length();
        int count[] = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            count[ch - 97]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                char ch = (char) (97 + i);
                System.out.println(ch + "\t" + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "vishnuvysharma";
        charFrequency(str);
    }


}
