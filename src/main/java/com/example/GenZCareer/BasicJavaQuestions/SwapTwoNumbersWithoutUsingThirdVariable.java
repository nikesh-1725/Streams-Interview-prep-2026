package com.example.GenZCareer.BasicJavaQuestions;

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {

        // One Way ---
        int a=10, b=20;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a: "+a+" b: "+b);

        // Second Way --

        int c=10, d=20;

        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("c: "+c+" d: "+d);


    }
}
