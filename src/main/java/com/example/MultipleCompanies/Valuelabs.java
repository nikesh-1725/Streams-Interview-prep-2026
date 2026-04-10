package com.example.MultipleCompanies;

import java.util.HashSet;
import java.util.Set;
public class Valuelabs {
    public static void main(String[] args) {
        String str="hiiamnikesh";

        String result=longestSubString(str);
        System.out.println(result);
    }

    private static String longestSubString(String str) {
        Set<Character> set= new HashSet<>();
        int left=0, max=0, start=0;
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
//            max=Math.max(max,right-left+1);
            if(right-left+1>max){
                max=right-left+1;
                start=left;
            }
        }


        return str.substring(start,start+max);
    }
}
