package com.example.BroadCom;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQuestions {
    public static void main(String[] args) {
        String str="Hello World";
        int[] arr={2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int target=7;
        boolean result=isPalindrome(str);
//        System.out.println(result);
//        occuranceOfEachCharacter(str);
//        twoSumProblem(arr,target);
        Person p1=new Person("Nikesh",4,new ArrayList<>());
        Person p2=new Person("Naveen",3,new ArrayList<>());
        Person p3=new Person("Raju",3,new ArrayList<>());

        List<Person> list= Arrays.asList(p1,p2,p3);

        System.out.println(list.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.collectingAndThen(Collectors.toList(),
                l->l.stream().map(Person::getName).toList()

        ))));
    }

    private static void twoSumProblem(int[] arr, int target) {
        Set<Integer> set=new HashSet<>();

        for(int num:arr){
            int diff=target-num;

            if(set.contains(diff)){
                System.out.println(diff+" "+num);
            }
            set.add(num);
        }
    }

    private static void occuranceOfEachCharacter(String str) {
        int[] count=new int[200];
//        char[] ch=str.toCharArray();

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0;i<200;i++){
            if(count[i]>0){
                System.out.println((char)i +" : "+count[i]);
            }
        }


    }

    private static boolean isPalindrome(String str) {

        char[] ch=str.toCharArray();

        int left=0, right=str.length()-1;

        while(left<right){
            if(ch[left] !=ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
