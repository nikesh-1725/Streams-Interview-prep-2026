package com.example.ApartFromStreams;

public class PalindromeEx {
    public static void main(String[] args) {


        String str="1074634";
        int left=0, right=str.length()-1;
        boolean result=true;
        while(str.charAt(left) != str.charAt(right)){
            result=false;
            break;
        }
        System.out.println(result);


    }
}
