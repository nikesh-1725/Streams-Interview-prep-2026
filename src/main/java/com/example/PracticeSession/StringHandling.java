package com.example.PracticeSession;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringHandling {
    public static void main(String[] args) {
        String str="Hi I am Nikeshhi";

//        str.chars().forEach(System.out::println);
//        str.chars().mapToObj(c->(char)c).forEach(System.out::println);

//        str.chars().mapToObj(c->(char)c)
//                .distinct().forEach(System.out::println);
//
//       String result= str.chars().mapToObj(c->(char)c)
//                .distinct()
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//        System.out.println(result);
//
//       String result1= IntStream.range(str.length(),0)
//                .map(s->str.charAt(s))
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining());
//        System.out.println(result1);
//
//        System.out.println(str.charAt(3));

        String result2=IntStream.range(0,str.length())
                .mapToObj(i->String.valueOf(str.charAt(str.length()-1-i)))
//                .forEach(System.out::println);
                .collect(Collectors.joining());
//        System.out.println(result2);

        Integer str1=null;
//        System.out.println(String.valueOf(str1));

        String sa="Nikesh Hey";
        System.out.println(sa.chars().mapToObj(s->(char)s)
                .collect(Collectors.groupingBy(t->t, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1)

                        .map(e->String.valueOf(e.getKey()))
                .collect(Collectors.joining())
        );

        // Count Vowels in String

      Long result3=  str.chars().filter(c->"aeiouAEIOU".indexOf(c)!=-1)
                .count();




//                .mapToObj(d->(char)d)
//                .forEach(System.out::println);

        System.out.println(result3);
        List<String> list=Arrays.asList("Hi ae", "hey aio", "lol iou");

        System.out.println( list.stream().filter(s->s.chars().filter(h->"aeiouAEIOU".indexOf(h)!=-1)
                .count()>3).toList() );

        System.out.println(str.indexOf(97));
        System.out.println(str.charAt(1));
        System.out.println((char)97);

    }

}
