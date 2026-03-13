package com.example.BasicInterviewQuestionsOutOfStreams;

public class ArmStrongEx {
    public static void main(String[] args) {
        // Write a Java program to check weather a number is an Armstrong number

        // Lets take 153 -> 1+125+27 -> 153

        int a=153,n=0,result=0, temp=a;

        while(a>0){
            n=a%10;
            result+=(n*n*n);
            a=a/10;

        }
        System.out.println(result==temp?"It is an Armstrong":"It is not Armstrong");
    }
}
