package com.core.java.java8.stream.obj;


public class Student {
    private String studentName;
    private String studentEmail;
    private long studentPhone;
    private Course2 course;

    public Student() {
    }

    public Student(String studentName, String studentEmail, long studentPhone, Course2 course) {
        super();
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public long getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(long studentPhone) {
        this.studentPhone = studentPhone;
    }

    public Course2 getCourse() {
        return course;
    }

    public void setCourse(Course2 course) {
        this.course = course;
    }


}