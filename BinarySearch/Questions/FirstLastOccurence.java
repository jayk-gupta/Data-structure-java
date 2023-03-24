package com.jay.BinarySearch.Questions;

import java.util.Arrays;

public class FirstLastOccurence {
    public static void main(String[] args) {
       int[] arr = {5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,7)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        //Check for First Occurrence if target first
        ans[0] = SearchIndex(nums,target,true);
        if (ans[0] != -1 ){
            ans[1] = SearchIndex(nums,target,false);
        }
        return ans;
    }
    //This function returns the value of Target
    public static   int SearchIndex (int[] nums, int target,boolean FindStartIndex){
        int ans =-1;
        int start=0;
        int end = nums.length-1;
        while (start<=end){
            //find middle element
            int mid = start + (end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start = mid+1;
            }
            //Potential ans
            else {
                ans = mid;
                //For finding first Occurrence
                if (FindStartIndex){
                    end = mid -1;
                }
                //For finding the last Occurrence
                else {
                    start =mid+1;
                }
            }
        }
        return ans;

    }
}
