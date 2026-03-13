package com.example.Capgemini;

import java.util.Arrays;
import java.util.List;

public class AddCommonValuesUsingAnotherList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5);
        List<Integer> list1= Arrays.asList(1,2,4,5,6,7);

        System.out.println(list.stream().filter(list1::contains).toList());
    }
}
