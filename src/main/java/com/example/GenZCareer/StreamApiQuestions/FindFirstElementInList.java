package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,5,7);

        int result=list.stream().findFirst().orElse(0);
        System.out.println(result);
    }
}
