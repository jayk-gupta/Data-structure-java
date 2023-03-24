package com.jay.Sorting.Questions;

public class LargestNumtwiceOfOthers {
    public static void main(String[] args) {
        int[] arr ={0,0,0,1};
        int ans = dominantIndex(arr);
        System.out.println(ans);

    }
    public static int dominantIndex(int[] nums) {
        boolean ans =false;
          int max =nums[0], MaxIndex =0;
        //        Finding max element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
                MaxIndex =i;
            }
        }
//        Checking max is at least twice of other elements
        for (int i = 0; i < nums.length; i++) {
            if (i == MaxIndex) break;;
            if (max >= 2*nums[i] ){
                ans =true;
            }
            else {
                ans =false;
            }
        }
        if (ans){
            return MaxIndex;
        }
        return -1;
    }
}
