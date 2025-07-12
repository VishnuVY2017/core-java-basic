package com.core.java.dsa.string;

public class Find_Max_Odd_Number {

    public static Integer findMaxOddValue(String str) {
        int maxOdd = -1;
        String numbers[] = str.split("[^0-9]+");
        for (int i = 0; i < numbers.length; i++) {

            int num = Integer.valueOf(numbers[i]);
            if (num % 2 == 1 && num > maxOdd) {
                maxOdd = num;
            }
        }
        return maxOdd;
    }

    public static void main(String[] args) {
        String str = "20asd60wewe0klkl83";
        System.out.println(findMaxOddValue(str));

    }
}
