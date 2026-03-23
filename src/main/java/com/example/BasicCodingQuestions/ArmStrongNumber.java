package com.example.BasicCodingQuestions;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n=153, temp=0, result=0, a=n;
        while(n>0){
            temp=n%10;
            result+=temp*temp*temp;
            n=n/10;
        }
        System.out.println(a==result?"It is ArmStrong":"It is not ArmStrong");


    }
}
