package com.example.JavaInterviewBuddy;

import java.util.*;
import java.util.stream.Collectors;

public class GroupOnIdWithThehighestSalary {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(
                new Employee(1,"Amit", "IT", 90000),
                new Employee(2,"Ravi", "HR", 120000),
                new Employee(1,"Neha", "IT", 110000),
                new Employee(3,"Pooja", "Finance", 80000),
                new Employee(2,"Kiran", "HR", 95000)
        );

        System.out.println( list.stream().collect(Collectors.groupingBy(Employee::getId,
                Collectors.collectingAndThen(Collectors.toList(),
                        emp->emp.stream().map(Employee::getSalary).max(Comparator.naturalOrder()).orElse(0.0)

                ))));

        // Best way to handle

        System.out.println(list.stream().collect(Collectors.toMap(Employee::getId, t->t.getSalary(),
                (e1,e2)->e1>=e2?e1:e2
                )));

    }
}
