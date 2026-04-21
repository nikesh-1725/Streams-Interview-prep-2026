package com.example.PracticeSession;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeOne {
    public static void main(String[] args) {
        // LongestSubString or In Array Of Integers

        String str="abcbcdefab";
        List<Integer> list= Arrays.asList(100, 4, 200, 1, 3, 2);
        List<Integer> list1= Arrays.asList(1,2,4,5);
        List<Integer> list3= Arrays.asList(1,2,0,4,0,5);
//        System.out.println(findLongestConsecutiveSubString(str));
//        System.out.println(findLongestConsecutiveInListOfIntegers(list));
        System.out.println(findMissingNumber(list1));
        System.out.println(moveZerosToEnd(list3));

    }

    private static List<Integer> moveZerosToEnd(List<Integer> list3) {
        return null;
    }

    private static int findMissingNumber(List<Integer> list1) {
        int first=list1.get(0);
        for(Integer i:list1){
            if(i!=first){
                return first;
            }
            first++;
        }
        return 0;
    }

    private static List<Integer> findLongestConsecutiveInListOfIntegers(List<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);

        int longest = 0;
        int startOfLongest = 0;
        System.out.println(set);
        for(Integer num : set){
            // start of sequence
            if(!set.contains(num - 1)){
                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                if (count > longest) {
                    longest = count;
                    startOfLongest = num;
                }
            }
        }
        // 🔥 Print the sequence
        System.out.print("Sequence: ");
        for (int i = 0; i < longest; i++) {
            System.out.print((startOfLongest + i) + " ");
        }

        System.out.println("\nLength: " + longest);
        System.out.println(longest);
        return null;
    }

    private static String findLongestConsecutiveSubString(String str) {
        int maxLength=0, start=0, left=0;
        Set<Character> set=new HashSet<>();
        for(int right=0;right<str.length()-1;right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));

            if(right-left+1>maxLength){
                maxLength=right-left+1;
                start=left;
            }
        }
        for (int i=start;i<start+maxLength;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println("Substring: " + str.substring(start, start + maxLength));

        return "";
    }
}
