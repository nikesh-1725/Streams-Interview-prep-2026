package com.example.MediumWebsite;

import java.util.Arrays;

public class FindAllTheNumbersStatingWithOne {
    public static void main(String[] args) {
        int[] nums={12,34,123,165,23,876};
        System.out.println(

                Arrays.stream(nums).boxed().filter(s->String.valueOf(s).startsWith("1")).toList()


        );
        FindAllTheNumbersStatingWithOne findAllTheNumbersStatingWithOne=new FindAllTheNumbersStatingWithOne();
        findAllTheNumbersStatingWithOne.getData();


    }

    private  void getData() {
        System.out.println(getClass());
    }
}
