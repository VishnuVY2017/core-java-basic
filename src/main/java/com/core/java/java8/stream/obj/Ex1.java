package com.core.java.java8.stream.obj;

public class Ex1 {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Vishnu","vishnu@jlc","12345");
        Course2 course1=new Course2("DevOps",15000, trainer1);
        Student student1=new Student("Hello", "hello@gmail", 111, course1);

        // I have access to Only Student Object and want trainer Email and Phone
        System.out.println(student1.getCourse().getTrainer().getTrainerName());
        System.out.println(student1.getCourse().getTrainer().getTrainerEmail());
        System.out.println(student1.getCourse().getTrainer().getTrainerPhone());
        System.out.println("---------------");

    }
}
