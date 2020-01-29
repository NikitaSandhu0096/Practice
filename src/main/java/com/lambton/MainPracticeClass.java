package com.lambton;

import java.util.Arrays;

public class MainPracticeClass {
    public static void main(String[] args) {
        StringExample s1 = new StringExample();
        s1.printString("NIKITA");

        System.out.println("==========");

        String[] arr = new String[]{"Nikita", "Sandhu"};
        String[] arr1 = new String[]{"Rahul","Sandhu"};
        s1.printStringArray(arr);
        //printArrayInReverse(arr);

        System.out.println("==========");

        StringExample s2 = new StringExample();
        System.out.println(s2.printStringReverse("Nikita"));

        System.out.println("==========");

        for (int i=0;i<arr.length;i++)
        {
            System.out.println(s1.printStringReverse(arr[i]));
        }

        System.out.println("==========");

        for(int i =0;i<arr.length;i++){
            System.out.println(s1.zigzag(arr[i]));
        }

        System.out.println("==========");

        for(int i =0;i<arr.length;i++){
            System.out.println(s1.zigzag(arr1[i]));
        }
    }
}
