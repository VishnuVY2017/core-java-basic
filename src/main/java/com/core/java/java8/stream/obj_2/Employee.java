package com.core.java.java8.stream.obj_2;

public class Employee {
    private Integer empId;
    private String name;
    private String email;
    private Double salary;
    private String department;

    public Employee() {

    }

    public Employee(Integer empId, String name, String email, Double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
