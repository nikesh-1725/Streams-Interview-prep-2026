package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipStreamEx {
    public static void main(String[] args) {
        // Limit the output to the first 3 elements of the list

        List<Integer> list= Arrays.asList(1,2,4,5,6);

        System.out.println(list.stream().skip(1).limit(3).toList());
    }
}
