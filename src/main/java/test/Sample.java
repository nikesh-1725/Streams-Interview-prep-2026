package test;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String s1 = "Every one is good at what they do on regular basis";

        System.out.println(Arrays.stream(s1.split(" ")).count());

    }
}
