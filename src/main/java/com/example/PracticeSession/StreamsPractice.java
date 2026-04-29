package com.example.PracticeSession;

import com.example.Capgemini.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractice {
    public static void main(String[] args) {
        //GivenListOfStringReturnMostRepatedValue
        //FindTheLongestSubStringWithoutRepeatingCharacter
        //GetEmployeeMaxSalaryBasedOnDept
        List<Employee> employees= Arrays.asList(
                new Employee("Alice", "HR",5000),
                new Employee("Bob", "HR",7000),
                new Employee("Charlie", "IT",9000),
                new Employee("David", "IT",5000),
                new Employee("Eve", "Finance",10000),
                new Employee("Frank", "Finance",5000)
        );
        List<String> colors = Arrays.asList(
                "Blue","yellow","Green","Blue","purple","yellow","Blue"
        );
        String str1 = "abcabcbb";
        int[] arr={6,9,2,1,8};
        int target=9;

        String str=colors.stream().collect(Collectors.groupingBy(t->t, Collectors.counting())
        ).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
            .orElse(null);

//        System.out.println(str);

//        backtrackingExample(arr, target);
        findLongestSubStringWithoutDuplicates(str1);
        getEmployeeMaxSalaryBasedOnDept(employees);



    }

    private static void getEmployeeMaxSalaryBasedOnDept(List<Employee> employees) {
        System.out.println( employees.stream().collect(Collectors.groupingBy(Employee::getDepartments, Collectors.maxBy(Comparator.comparing(Employee::getSalary)))));
    }

    private static void findLongestSubStringWithoutDuplicates(String str1) {
        Set<Character> set=new HashSet<>();
        int left=0, maxLen=0, start=0;
        for(int right=0;right< str1.length();right++){
            while(set.contains(str1.charAt(right))){
                set.remove(str1.charAt(left));
                left++;
            }
            set.add(str1.charAt(right));

            if(right-left+1>maxLen){
                maxLen=right-left+1;
                start=left;
            }
        }
        System.out.println("Entered");
        System.out.println(str1.substring(start,maxLen));

    }

    private static void backtrackingExample(int[] arr, int target) {

        List<List<Integer>> result=new ArrayList<>();
        startBackTracking(arr, target, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void startBackTracking(int[] arr, int target, int start, ArrayList<Integer> temp, List<List<Integer>> result) {

        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<arr.length;i++){
            if(arr[i]>target) continue;

            temp.add(arr[i]);
            startBackTracking(arr,target-arr[i], i, temp, result );
            temp.remove(temp.size()-1);
        }



    }
}
