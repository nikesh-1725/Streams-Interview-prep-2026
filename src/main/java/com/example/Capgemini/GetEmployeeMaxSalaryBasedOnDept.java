package com.example.Capgemini;

import java.util.*;
import java.util.stream.Collectors;

public class GetEmployeeMaxSalaryBasedOnDept {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee("Alice", "HR",5000),
                new Employee("Bob", "HR",7000),
                new Employee("Charlie", "IT",9000),
                new Employee("David", "IT",5000),
                new Employee("Eve", "Finance",10000),
                new Employee("Frank", "Finance",5000)
        );

       Map<String, Optional<Employee>> result=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartments,LinkedHashMap::new,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

       result.forEach((key,val)-> System.out.println(key+" "+(val.orElse(null))));
        System.out.println(result);

    }
}
