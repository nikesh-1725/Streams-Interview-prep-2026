package com.example.CoreJavaQuestions;

public class WhyJavaIsCallByValue {
    int w = 10;

    void change(int x) {
        x = 20;
    }

    void changeObj(WhyJavaIsCallByValue why) {
        why.w = 20;
    }

    public static void main(String[] args) {

        // Primitive Example
        int a = 10;
        WhyJavaIsCallByValue obj = new WhyJavaIsCallByValue();

        obj.change(a);
        System.out.println("After change(a): a = " + a); // still 10


        // Object Example
        System.out.println("Before changeObj: obj.w = " + obj.w);

        obj.changeObj(obj);

        System.out.println("After changeObj: obj.w = " + obj.w); // becomes 20
    }
}