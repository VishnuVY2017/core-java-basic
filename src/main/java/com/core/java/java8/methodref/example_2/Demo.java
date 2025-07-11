package com.core.java.java8.methodref.example_2;

public class Demo {
    public static void main(String[] args) {

        //1.Lambda Style
        Hello hello1 = (a, b, c, d) -> {
            Course course = new Course(a, b, c, d);
            return course;
        };
        Course course1 = hello1.test(101, "DevOps", "60 Hrs", "Vishnu Sharma");
        System.out.println(course1);

        //2.Method Refernce Style
        Hello hello2 = Course::new;
        Course course2 = hello2.test(102, "Boot - MicroServices", "100 Hrs", "Vishnu Mistry");
        System.out.println(course2);

        System.out.println("Done!!!");
    }
}