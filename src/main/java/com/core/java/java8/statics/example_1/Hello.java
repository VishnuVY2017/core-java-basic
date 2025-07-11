package com.core.java.java8.statics.example_1;

public class Hello implements A {

    public void test() {
        System.out.println(P); //Inherited
        System.out.println(Q); //Inherited

        m1(); //Overriden
        m2(); //Overriden
        m3(); //Overriden

        A.super.m3();
        m4(); //Inherited
        A.super.m4();
        A.m5();
        A.m6();

        //A.super.m6();
    }

    @Override
    public void m1() {
        System.out.println("Hello -m1");
    }

    @Override
    public void m2() {
        System.out.println("Hello -m2");
    }

    @Override
    public void m3() {
        System.out.println("Hello -m3");
    }

//    @Override
//    public static void m5() {
//    System.out.println("Hello -m5");
//    }

}
