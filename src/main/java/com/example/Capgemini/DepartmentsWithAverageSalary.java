package com.example.Capgemini;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentsWithAverageSalary {
    public static void main(String[] args) {

        List<Employee> employees= Arrays.asList(
                new Employee("Alice", "HR",5000),
                new Employee("Bob", "HR",7000),
                new Employee("Charlie", "IT",9000),
                new Employee("David", "IT",5000),
                new Employee("Eve", "Finance",10000),
                new Employee("Frank", "Finance",5000)
                );

        Map<String, Double> result=employees.stream().collect(Collectors.groupingBy(Employee::getDepartments, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(result);
    }
}
