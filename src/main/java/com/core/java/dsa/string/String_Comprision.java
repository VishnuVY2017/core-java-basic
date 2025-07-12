package com.core.java.dsa.string;

public class String_Comprision {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); // true (Both reference the same object in String Pool)

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s3 == s4); // false (Different objects in Heap memory)
        System.out.println(s3.equals(s4)); // true (Same content)

        s3 = s3.intern();
        System.out.println(s3 == s2);
    }


}
