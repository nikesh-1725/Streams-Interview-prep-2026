package com.example.MultipleCompanies;

import java.util.Stack;

public class Ranstad {
    public static void main(String[] args) {

        String str="()[]{}";
        boolean result=false;
        //
        Stack<Character> chars=new Stack<>();
        for(char c:str.toCharArray()) {
            if (c=='(' || c=='[' || c=='{'){
                chars.push(c);
            }
            else {
                if (chars.isEmpty()) {
                    System.out.println(result);
                    return;
                }

                char top = chars.pop();
                if ((c == ')') && top != '('
                        || (c == ']') && top != '['
                        || (c == '}') && top != '{'
                ) {
                    System.out.println(result);
                    return;
                }
            }
        }
        System.out.println(chars.isEmpty()?true:false);
    }
}
