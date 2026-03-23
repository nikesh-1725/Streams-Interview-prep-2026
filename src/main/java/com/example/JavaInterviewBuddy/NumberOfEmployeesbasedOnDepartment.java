package com.example.JavaInterviewBuddy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfEmployeesbasedOnDepartment {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(
                new Employee(1,"Amit", "IT", 90000),
                new Employee(2,"Ravi", "HR", 120000),
                new Employee(1,"Neha", "IT", 110000),
                new Employee(3,"Pooja", "Finance", 80000),
                new Employee(2,"Kiran", "HR", 95000)
        );

        System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
    }
}
