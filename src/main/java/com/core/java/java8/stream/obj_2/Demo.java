package com.core.java.java8.stream.obj_2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        //######################### Employee Objects #######################
        Employee e1 = new Employee(4, "jitendra", "jit@gmail.com", 50000.0, "SALES");
        Employee e2 = new Employee(6, "Mahesh", "mahii@gmail.com", 60000.0, "SALES");
        Employee e3 = new Employee(3, "Rajesh", "raju@gmail.com", 40000.0, "HR");
        Employee e4 = new Employee(1, "Bikesh", "bika@gmail.com", 700000.0, "IT");
        Employee e5 = new Employee(5, "Santosh", "sant@gmail.com", 30000.0, "IT");
        Employee e6 = new Employee(2, "Aman", "aman@gmail.com", 80000.0, "SALES");
        Employee e7 = new Employee(7, "Lakhan", "lakhan@gmail.com", 20000.0, "TRANSPORT");

        //######################### Map object with employee objects #######################
        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, e1);
        empMap.put(2, e2);
        empMap.put(3, e3);
        empMap.put(4, e4);
        empMap.put(5, e5);
        empMap.put(6, e6);
        empMap.put(7, e7);

        //#################LIST OF INTEGERS################################
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(4);
        intList.add(5);
        intList.add(3);
        intList.add(10);
        intList.add(9);
        intList.add(9);
        intList.add(0);
        intList.add(2);
        intList.add(2);
        intList.add(2);
        intList.add(2);

        //################ LIST OF STRING ###################################
        List<String> stringList = new ArrayList<>();
        stringList.add("jitendra");
        stringList.add("manish");
        stringList.add("sanjy");
        stringList.add("bikesh");
        stringList.add("karan");
        stringList.add("Dinesh");
        stringList.add("Rajan");
        stringList.add("Devanand");
        stringList.add("Ramesh");
        stringList.add("Varun");
        stringList.add("jitendra");
        stringList.add("manish");

        //################# ARRAY OF INTEGERS ###################################
        Integer[] intArr1 = {1, 3, 5, 8, 9, 10, 2, 3, 11};
        Integer[] intArr2 = {5, 3, 7, 8, 12, 20, 15, 3, 16};

        //#################LIST OF INTEGERS####################################
        List<Integer> list1 = Arrays.asList(intArr1);
        List<Integer> list2 = Arrays.asList(intArr2);

        //#################### Map <String Integer> ############################
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);
        map.put("D", 50);
        map.put("E", 40);


        //A map has employee id as key and value as employee object. Sort the map based on the employee salary
        Map<Integer, Employee> sortedEmployeeObject = empMap.entrySet().stream()
                .sorted((emp1, emp2) -> emp1.getValue().getSalary().compareTo(emp2.getValue().getSalary()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        sortedEmployeeObject.entrySet().forEach(a -> {
            System.out.println("Employee key : "+a.getKey() + " Employee Values : " + a.getValue().getSalary());
        });

        System.out.println("==============================");
        //A map has employee id as key and value as employee object. Find the total sum of employee salary group by department
        //Group only those employee whose salary greater than 25000.
        LinkedHashMap<String, Double> mapObj_department = empMap.entrySet().stream()
                .map(emp -> emp.getValue())
                .filter(emp -> emp.getSalary() > 25000)
                .collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.summingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        mapObj_department.entrySet().forEach(a -> {
            System.out.println("Employee Department : "+a.getKey() + " Employee Department Salary : " + a.getValue());
        });

        System.out.println("==============================");
        //Find the duplicate occurrence of characters from a string and sort it based on occurrence
        String str = "ACFEMENABCCABCDSSOA";
        Map<String, Long> collect = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        collect.entrySet().forEach(a -> {
            System.out.println("Char : "+a.getKey() + " : " + a.getValue());
        });


        System.out.println("==============================");
        //Merge Two arrays and get the distinct elements.
        List<Integer> collect1 = Stream.concat(Arrays.stream(intArr1), Arrays.stream(intArr2))
                .sorted((a,b) -> a.compareTo(b))
                .collect(Collectors.toList());

        System.out.println(collect1);


        System.out.println("==============================");
        /**
         * Given the array of strings. Each string contains two parts - Word and its count separated by comma(,):
         * - Filter by word(1st part) length > 4
         * - Sort by word count(2nd part) desc
         * - Find 2nd highest word based on above sorted result
         * Solve using Java Streams API
         * String[] strArray = {"POINT,2342342", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};
         * Output: QWERTY
         */

        String[] strArray = {"POINT,2342342", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};
        Optional<String> first = Stream.of(strArray)
                .filter(x -> x.split(",")[0].length() > 4)
                .sorted((x, y) -> y.compareTo(x))
                .skip(1).findFirst();

        if(first.isPresent()){
            System.out.println(first.get());
        }

        System.out.println("==============================");

    }
}
