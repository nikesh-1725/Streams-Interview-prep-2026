package com.example.BasicCodingQuestions;

public class FibinocciOfNumber {
    public static void main(String[] args) {
        fibinnoci(10);

    }

    private static void fibinnoci(int n) {
        int a = 0, b = 1, temp = 0;
        System.out.print(a + " " + b);
        for (int i = 0; i < n - 2; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(" " + temp);
        }
    }

    // Another Simple way
    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
