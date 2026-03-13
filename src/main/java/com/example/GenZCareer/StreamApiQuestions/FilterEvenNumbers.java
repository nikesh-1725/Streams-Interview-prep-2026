package com.example.GenZCareer.StreamApiQuestions;

import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7);
        System.out.println(list.stream().filter(a->a%2==0).toList());
    }
}
