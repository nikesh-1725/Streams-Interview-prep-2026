package com.example.GenZCareer.StreamApiQuestions.AdvancedStreamQuestions;

import java.util.*;

public class DuplicateElementsInInteger {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,34,5,5,1,2,5,6,9,0);
//        Collections.sort(list);
        Set<Integer> set=new HashSet<>();
        list.stream().filter(m->!set.add(m)).distinct().forEach(System.out::println);

        System.out.println("Distinct Values........");
        System.out.println(list.stream().distinct().toList());


    }

}
