package com.example.TestCheck;

import com.example.PersistantSystems.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Nikehs","Hello","ahyeio","baskeri");
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

        System.out.println(str.stream().filter(s->s.chars()
                .filter(d->"aeiouAEIOU".indexOf(d)!=-1)
                .count()>2).toList());

       Map<String, Double> result=list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
                Collectors.toList(),
                l->l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getSalary).skip(1).findFirst().get()

        )));
        System.out.println(result);

      Map<String, List<Employee>> result1= list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
               Collectors.collectingAndThen(
                       Collectors.toList(),
                       l->l.stream().filter(e->e.getId()>2).toList()

               )));
        System.out.println(result1);

    }
}
