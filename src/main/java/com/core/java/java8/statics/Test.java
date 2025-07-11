package com.core.java.java8.statics;

@FunctionalInterface
public interface Test {

    void test();

     default String m1(){
        return "";
    }

    private void p1(){

    }

    private static void p2(){

    }
}
