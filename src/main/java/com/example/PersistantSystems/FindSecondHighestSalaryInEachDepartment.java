package com.example.PersistantSystems;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindSecondHighestSalaryInEachDepartment {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(new Employee(1, "Nikesh","IT",200),
                new Employee(2, "Naveen","IT",200),
                new Employee(2, "Naveen","IT",200),
                new Employee(4, "Sneha","IT",500),
                new Employee(5, "Mom","NON-IT",700),
                new Employee(6, "Dade","IT",100),
                new Employee(7, "Fish","NON-IT",600),
                new Employee(7, "Fish","NON-IT",600),
                new Employee(8, "Cat","HR",200),
                new Employee(9, "Naresh","NON-IT",900),
                new Employee(10, "Rat","HR",1000)
        );

        System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getDepartment))

                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().stream().map(Employee::getSalary).sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0.0)))


        );
    }
}
