package com.jay.LeetcodeQuestions;
//Given a positive integer num, write a function which returns True if num is a perfect square else False.
public class ValidPerfectSqrt {
    public static void main(String[] args) {
        System.out.println(CheckSq(9));
    }

    public static boolean CheckSq(int num) {
        long start=0;
        long end = num,ans=0;
        while (start<=end){
            //find middle element
            long mid = start + (end-start)/2;
            if (mid*mid>num){
                end=mid-1;
            }
            else if (mid*mid<num){
                start = mid+1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
