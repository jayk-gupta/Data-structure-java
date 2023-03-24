package com.jay.LeetcodeQuestions.MathQues;

public class SqrtRootDecimal {
    public static void main(String[] args) {
        System.out.println(mySqrt(37)); //46340

    }
    public static float mySqrt(int x) {
        long start = 0;
        long end = x;
        while (start<=end){
            long mid = start +(end-start)/2;
            if (mid*mid == x){
                return (int)mid;
            }
            else if (mid*mid> x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return    findingDecimal(end,x);
    }
   static float findingDecimal(float mid, int x){
        while (mid*mid<x){
            mid+=0.1;
        }
        return mid;
   }














}
