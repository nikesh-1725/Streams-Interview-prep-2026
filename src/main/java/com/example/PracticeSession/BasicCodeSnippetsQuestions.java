package com.example.PracticeSession;

public class BasicCodeSnippetsQuestions {
    public static void main(String[] args) {
        Integer a=200;
        Integer b=200;

        int c=200;
        int d=200;

//        System.out.println(a==b);
//        System.out.println(c==d);

        A n=new B();
       n.test();
    }
}

class A{
    static void test(){
        System.out.println("Parent");
    }
}
class B extends A{
    static void test(){
        System.out.println("Child");
    }
}
