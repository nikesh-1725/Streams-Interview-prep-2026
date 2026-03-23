package com.example.JavaInterviewBuddy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortSalaryInDescendingOrderIfSalariesSameSortByNameInAscendingOrderCaseInSensitive {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(
                new Employee(1,"Amit", "IT", 90000),
                new Employee(2,"Ravi", "HR", 120000),
                new Employee(2,"Rajesh", "HR", 150000),
                new Employee(1,"Neha", "IT", 90000),
                new Employee(3,"Pooja", "Finance", 80000),
                new Employee(3,"Rashmi", "Finance", 120000),
                new Employee(2,"Kiran", "HR", 95000)
        );

        // Comparator Chaining

        System.out.println(list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(e->e.getName().toLowerCase())).toList());

    }
}
