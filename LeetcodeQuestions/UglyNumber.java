package com.jay.LeetcodeQuestions;

import java.util.ArrayList;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
    public static boolean isUgly(int n) {
        if (n==1) return true;
      if (n%2==0 || n%3==0 || n%5==0){
          return true;
      }
        return false;
    }


}
