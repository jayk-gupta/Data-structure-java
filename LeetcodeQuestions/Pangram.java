package com.jay.LeetcodeQuestions;

import java.util.Arrays;
import java.util.Objects;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "aabb";
        System.out.println(checkIfPangram(sentence));

    }
    public static boolean checkIfPangram(String sentence) {
       char[] ch = sentence.toCharArray();
       boolean flag = false;
        for (int i = 'a'; i <='z' ; i++) {
            for (int j = 0; j < ch.length; j++) {
                 if (ch[j]==i){
                     flag =true;
                 }
            }
        }
        return flag;
    }


}
