package com.example.GenZCareer.BasicJavaQuestions;

public class ReverseStringWithoutUsingInBuiltFunctions {
    public static void main(String[] args) {
        String str="nikeshreddy";
        char[] chars=str.toCharArray();
        int left=0, right=chars.length-1;
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(chars));
    }
}
