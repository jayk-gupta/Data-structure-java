package com.jay.LeetcodeQuestions.Array;
//optimize
import java.util.Arrays;

public class NumbersSmallerThan {
    public static void main(String[] args) {
     int[] arr ={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length;j++){
                  if (nums[i]>nums[j]){
                      ans[i]++;
            }
        }
    }
        return ans;
    }

}
