package com.example.JavaInterviewBuddy;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionNumbersIntoEvenAndOddValues {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
       Map<Boolean, List<Integer>> result= list.stream().collect(Collectors.partitioningBy(e->e%2==0));

        result.forEach((key, value)-> {
            if(key){
                System.out.println("Even Numbers: "+value);
            }
            else {
                System.out.println("Odd Numbers: "+value);
            }
        });

    }
}
