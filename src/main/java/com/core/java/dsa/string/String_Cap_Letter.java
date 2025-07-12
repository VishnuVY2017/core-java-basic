package com.core.java.dsa.string;

public class String_Cap_Letter {

    public static void main(String[] args) {

        String str = "vishnu is good boy";

        String strSplit[] = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String st: strSplit){
            sb.append(st.substring(0,1).toUpperCase() + st.substring(1));
            sb.append(" ");
        }

        System.out.println(sb.toString().substring(0, str.toString().length()));
        System.out.println(sb.toString());


    }
}
