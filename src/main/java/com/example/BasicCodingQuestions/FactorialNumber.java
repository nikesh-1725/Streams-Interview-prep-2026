package com.example.BasicCodingQuestions;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    private static int findFactorial(int n) {
        return (n==0)?1:n*findFactorial(n-1);
    }

}
