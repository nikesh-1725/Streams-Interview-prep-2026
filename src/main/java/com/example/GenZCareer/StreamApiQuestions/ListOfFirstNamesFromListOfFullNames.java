package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class ListOfFirstNamesFromListOfFullNames {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Nikesh Chimula","Naresh Pakeer", "Naveen Kodimala");

        System.out.println(list.stream().map(m->m.split(" ")[0]).toList());
    }
}
