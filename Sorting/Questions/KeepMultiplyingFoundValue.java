package com.jay.Sorting.Questions;

public class KeepMultiplyingFoundValue {
    public static void main(String[] args) {
     int[] arr ={8,19,4,2,15,3};
     int ans =findFinalValue(arr,2);
        System.out.println(ans);
    }
    public static int findFinalValue(int[] nums, int original) {
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == original){
                original = 2*nums[i];
                i=-1;
            }
        }

      return original;
    }
}
