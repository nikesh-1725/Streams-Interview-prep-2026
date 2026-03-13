package com.example.ApartFromStreams;

public class UseCustomFunctionalInterface{
    public static void main(String[] args) {
        CreateCustomFunctionInterface c=(a,b)->a+b;
        System.out.println(c.sum(1,2));

    }
}
