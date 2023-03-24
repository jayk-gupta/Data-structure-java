package com.jay.LeetcodeQuestions;

public class SqrtBinarySearch {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        long start=0;
        long end = x,ans=0;
        while (start<=end){
            //find middle element
            long mid = start + (end-start)/2;
            if (mid*mid>x){
                end=mid-1;
            }
            else if (mid*mid<x){
                ans = mid;
                start = mid+1;
            }
            else{
                return (int) mid;
            }
        }
        return (int)ans;

    }
}
