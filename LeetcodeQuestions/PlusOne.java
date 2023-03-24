package com.jay.LeetcodeQuestions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] a ={9};
        System.out.println(Arrays.toString(plusOne(a)));

    }
     static public int[] plusOne(int[] digits) {
        int ans=0;
         for (int i = 0; i <digits.length ; i++) {
             ans=ans * 10+digits[i];
         }
        ans++;
         int[] arr = new int [digits.length];
         for (int i = arr.length-1; i >=0; i--) {
             arr[i] =ans%10;
             ans/=10;
         }
         return arr;

    }
}
