package com.example.ApartFromStreams;

public class FibonacciEx {
    public static void main(String[] args) {
        int n=6,result=0, a=0,b=1;
        if(n<=1){
            result=n;
        }
        else {
            for(int i=2;i<=n;i++){
                result=a+b;
                a=b;
                b=result;
            }
        }
        System.out.println(result);
    }
}
