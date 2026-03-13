package com.example.GenZCareer.StreamApiQuestions;

import java.util.List;

public class CountElementsGreaterThanN {
    public static void main(String[] args) {
        int n=5;
        List<Integer> list=List.of(1,2,3,4,5,6,7);
        System.out.println(list.stream().filter(a->a>n).count());
    }
}
