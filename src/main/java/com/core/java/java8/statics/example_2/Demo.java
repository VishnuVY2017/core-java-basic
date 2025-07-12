package com.core.java.java8.statics.example_2;

public class Demo {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.test();
//1. Calling Static Method with Ref. Variable having Null
// A aobj = null;
//aobj.m1();
        Hello hello1 = null;
        hello1.show();
//2. Calling Static Method with Ref. Variable having Object address
//A aobj = new Hello();
//aobj.m1();
        Hello hello2 = new Hello();
        hello2.show();
//3. Calling Static Method with Class Name
        A.m1();
        Hello.show();
// Interface Static Methods must called with Interface name always
    }
}