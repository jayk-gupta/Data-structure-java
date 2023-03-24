package com.jay.LeetcodeQuestions;

public class PowerOfFour {
    public static void main(String[] args) {
//        System.out.println(isPowerOfFour(1));
        System.out.println(Math.pow(4,0));
    }
    public static boolean isPowerOfFour(double n) {
        for (double i = 0; i<16; i++) {
             double ans = Math.pow(4,i);
             if (n==ans){
                 return true;
             }
        }
        return false;
}
}
