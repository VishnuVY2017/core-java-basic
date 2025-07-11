package com.core.java.dsa.string;

// Count the word given in String
public class CountWords {


    public static String trimSpace(String str){
        int n = str.length();
        int start = 0;
        int end = n-1;
        Character c = ' ';

        while(start <= end && str.charAt(start) == ' '){
            start++;
        }

        while(start <= end && str.charAt(end) == ' '){
            end--;
        }

        StringBuilder sb = new StringBuilder();

        while(start <= end){
            char ch = str.charAt(start);
            if(ch != ' '){
                sb.append(ch);
            }else if (sb.charAt(sb.length()-1) != ' '){
                sb.append(ch);
            }
            start++;
        }

        return sb.toString();
    }

    public static int countWord(String str){
        int n = str.length();
        int start = 0;
        int count  = 1;
        for(int i = 0; i<n; i++){
            if(str.charAt(i) == ' ')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

        String str = "   Hello    Guys  How    Are    You   ";
        System.out.println(str);


        str = trimSpace(str);
        int result = countWord(str);

        System.out.println(result);
    }
}
