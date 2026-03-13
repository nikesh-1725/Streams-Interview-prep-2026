package com.example.GenZCareer.StreamApiQuestions.AdvancedStreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAllEvenNumbersExistsInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,5,6,8,7,9);
        System.out.println(list.stream().filter(n->n%2==0).toList());
        // OR
        int[] a={10, 4,6,7,9,3};
        Map<Boolean, List<Integer>> result=Arrays.stream(a).boxed().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result);
    }
}
