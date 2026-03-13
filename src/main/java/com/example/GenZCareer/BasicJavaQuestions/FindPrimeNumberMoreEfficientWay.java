package com.example.GenZCareer.BasicJavaQuestions;

import java.util.Scanner;

public class FindPrimeNumberMoreEfficientWay {
    public static void main(String[] args) {
        int prime=0;
        Scanner sc=new Scanner(System.in);
        prime=sc.nextInt();
        boolean result=false;
        if(prime<=1) result=false;
        if(prime<=3) result=true;
        if(prime%2==0 || prime%3==0) result=false;
        for (int i=5; prime>=i*i;i+=6 ){
            if(prime %i==0 || prime%(i+2)==0) result=false;
        }
        result=true;
        System.out.println(result);
    }
}
