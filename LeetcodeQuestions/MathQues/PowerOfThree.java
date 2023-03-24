package com.jay.LeetcodeQuestions.MathQues;

public class PowerOfThree {
    public static void main(String[] args) {
    boolean ans = isPowerOfThree(729);
        System.out.println(ans);
    }
    public static boolean isPowerOfThree(int n) {
      if (n==1) return true;
        int i=2;
        while (i<32){
          if (Math.pow(3,i) == n) return true;
            i++;
      }
        return false;
    }
}
