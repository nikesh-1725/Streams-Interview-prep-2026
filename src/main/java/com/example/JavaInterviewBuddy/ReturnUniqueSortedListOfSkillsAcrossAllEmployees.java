package com.example.JavaInterviewBuddy;


import java.util.*;
import java.util.stream.Collectors;

public class ReturnUniqueSortedListOfSkillsAcrossAllEmployees {
    public static void main(String[] args) {
        List<Student> list=Arrays.asList(
                new Student(1,"Nikesh",Arrays.asList("Java", "Spring", "Docker")),
                new Student(1,"Naveen",Arrays.asList("Java", "AWS", "Kafka")),
                new Student(1,"Naresh",Arrays.asList("Microservices", "HTML", "CSS")),
                new Student(1,"Amit",Arrays.asList("HTML", "VLSI", "ReactJs"))

        );

        System.out.println(list.stream().flatMap(s->s.getSkills().stream())
                .distinct()
                        .sorted().toList()

                );

    }
}
