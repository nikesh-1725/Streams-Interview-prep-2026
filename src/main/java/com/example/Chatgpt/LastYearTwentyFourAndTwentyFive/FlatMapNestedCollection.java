package com.example.Chatgpt.LastYearTwentyFourAndTwentyFive;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class FlatMapNestedCollection {
    public static void main(String[] args) {
        List<Employee> dept1Employees = Arrays.asList(
                new Employee(1, "John", 60000),
                new Employee(2, "Alice", 70000)
        );

        List<Employee> dept2Employees = Arrays.asList(
                new Employee(3, "Bob", 80000),
                new Employee(4, "David", 55000)
        );

        List<Department> departments = Arrays.asList(
                new Department("HR", dept1Employees),
                new Department("IT", dept2Employees)
        );

        System.out.println(departments.stream().map(c->c.getEmployees().stream().filter(emp->emp.getSalary()>70000).toList()).toList());

        System.out.println("New Approach: "+departments.stream().flatMap(dpt->dpt.getEmployees().stream()).filter(s->s.getSalary()>70000).toList());

        long sum = LongStream.rangeClosed(1, 1_000_000)
                .parallel()
                .sum();

        System.out.println(sum);
        System.out.println(1_0_0_0);
    }
}
