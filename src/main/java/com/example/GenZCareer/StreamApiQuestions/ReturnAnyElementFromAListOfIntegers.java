package com.example.GenZCareer.StreamApiQuestions;

import java.util.List;

public class ReturnAnyElementFromAListOfIntegers {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7);

        System.out.println(list.stream().findAny().orElse(0));

        //To know the exact functionality we need to try findAny in parallel streams

        System.out.println(list.parallelStream().findAny().orElse(0));
    }
}
