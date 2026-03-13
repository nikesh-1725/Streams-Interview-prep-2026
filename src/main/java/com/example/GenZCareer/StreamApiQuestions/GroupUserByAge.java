package com.example.GenZCareer.StreamApiQuestions;



import com.example.GenZCareer.StreamApiQuestions.dto.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupUserByAge {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Nikesh",300.0,26));
        list.add(new Employee("Naveen",300.0,30));
        list.add(new Employee("Sam",300.0,40));
        list.add(new Employee("Naresh",300.0,45));
        list.add(new Employee("Ramesh",300.0,39));


        System.out.println(list.stream().filter(a->a.getAge()>40).toList());

        List<UserEx> userExs = List.of(
                new UserEx(1, "Ravi", 25),
                new UserEx(2, "Naresh", 30),
                new UserEx(3, "Rohit", 25),
                new UserEx(4, "Naveen", 30),
                new UserEx(5, "Arjun", 35)
        );

        Map<Integer, List<UserEx>> result=userExs.stream().collect(Collectors.groupingBy(UserEx::getAge));

        System.out.println(result);


    }
}
