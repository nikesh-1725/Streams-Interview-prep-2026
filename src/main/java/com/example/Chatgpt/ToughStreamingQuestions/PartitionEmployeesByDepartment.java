package com.example.Chatgpt.ToughStreamingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PartitionEmployeesByDepartment {
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

        System.out.println(list.stream().collect(Collectors.partitioningBy(s->s.getDepartment().equals("IT"), Collectors.counting())));
        System.out.println( list.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(e->e.getKey(), e->e.getValue().stream().map(Employee::getName).toList()))
//                .forEach(x-> System.out.println(x.getKey()+" "+x.getValue().stream().map(Employee::getName).toList())
                );
    }
}
