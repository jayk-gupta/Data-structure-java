package com.jay.LeetcodeQuestions;

import java.util.ArrayList;

public class FizzBUzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));

    }

    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>(5);
        for (int i = 1; i <=n ; i++) {
            if (i%3==0 && i%5==0){
                 list.add("FizzBuzz");
            }
            else if (i%3==0 ){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(Integer.toString(i));
            }
        }
        return list;



    }
}
