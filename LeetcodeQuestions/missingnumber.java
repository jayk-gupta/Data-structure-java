package com.jay.LeetcodeQuestions;

public class missingnumber {
    public static void main(String[] args) {
               int[] arr ={0,1,9,8,4,5,2,3,7};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int sum=0, n=nums.length+1,Sum =(n*(n-1))/2;
        for (int i = 0; i <nums.length ; i++) {
                sum+=nums[i];
        }
        return Sum-sum;

    }

    
}
