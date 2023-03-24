package com.jay.LeetcodeQuestions;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(99999998));
    }
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
