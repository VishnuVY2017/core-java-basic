package com.core.java.dsa.string;

// Reverse the word given in String
public class Reverse_Words {


    public static String trimSpace(String str) {
        int n = str.length();
        int start = 0;
        int end = n - 1;
        Character c = ' ';

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (start <= end && str.charAt(end) == ' ') {
            end--;
        }

        StringBuilder sb = new StringBuilder();

        while (start <= end) {
            char ch = str.charAt(start);
            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(ch);
            }
            start++;
        }

        return sb.toString();
    }

    public static void reverse(char arr[], int start, int end) {

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


    public static void reverseWord(char arr[]) {
        int n = arr.length;
        int start = 0;
        int end = 0;
        while(end<n){
            if (arr[end] == ' '){
                reverse(arr, start, end - 1);
                start = end+1;
            }
            end++;
        }
        reverse(arr, start, end - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        String str = "   Hello    Guys  How    Are    You   ";
        System.out.println(str);
        str = trimSpace(str);
        System.out.println(str);

        char charArr[] = str.toCharArray();
        reverseWord(charArr);
        System.out.println(String.valueOf(charArr));
    }
}
