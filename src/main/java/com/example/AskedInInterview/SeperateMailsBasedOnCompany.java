package com.example.AskedInInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateMailsBasedOnCompany {
    public static void main(String[] args) {
        String[] list={"ravi@gmail.com","naveen@hotmail.com","rohit@gmail.com","naresh@yahoo.com"};

       Map<String, List<String>> result= Arrays.stream(list).collect(Collectors.groupingBy(email->email.split("@")[1].split("\\.")[0]));

        System.out.println(result);

    }
}
