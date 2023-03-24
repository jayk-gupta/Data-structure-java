package com.jay.LeetcodeQuestions.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
       int[] arr ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(arr,3)));
    }
    public static int[] rotate(int[] nums, int k) {
     int temp;
        for (int i = 0; i <3 ; i++) {
            for (int j = nums.length-2; j>0 ; j--) {
                 temp=nums[j+1];
                 nums[j+1]= nums[j-1];
                 nums[j-1]=temp;
            }
        }
      return nums;
    }
}
