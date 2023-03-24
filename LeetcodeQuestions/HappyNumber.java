package com.jay.LeetcodeQuestions;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println( isHappy(1111111));
    }
    public static boolean isHappy(int n) {
        int sum = 0;
        if (n==1){
            return true;
        }
        while (n != 1) {
            while (n !=0) {
                int r = n % 10;
                sum += r*r;
                n /= 10;
            }
            if (sum!=1 && sum<10){
                return false;
            }
            n = sum;
            sum=0;
            if (n==1){
                return true;
            }
        }
        return  false;
}
}
