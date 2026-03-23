package com.example.PersistantSystems;


import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployesByDepartmentAndReturnEmployeesGreaterThanTwo {
    public static void main(String[] args) {

        List<Employee> list= Arrays.asList(new Employee(1, "Nikesh","IT",200),
                new Employee(2, "Naveen","IT",200),
                new Employee(3, "Naresh","NON-IT",200),
                new Employee(4, "Sneha","IT",200),
                new Employee(5, "Mom","NON-IT",200),
                new Employee(6, "Dade","IT",200),
                new Employee(7, "Fish","NON-IT",200),
                new Employee(1, "Cat","HR",200),
                new Employee(1, "Rat","HR",200)
                );

        System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))

                .entrySet()
                .stream()
                .filter(e->e.getValue()>2)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue))


        );




    }
}
