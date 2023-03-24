package com.jay.LeetcodeQuestions;
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println( searchInsert(arr,7));
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        while (start<=end) {
            //find middle element
            int mid = start + (end - start) / 2;
            // Condition 1:
            // mid == target, return mid(index)
            if (nums[mid] == target) {
                return mid;
            }
            //If target<number
            if (target < nums[mid]) {
                end = mid - 1;
            }
            //If target>number
            else {
                start = mid + 1;
            }
        }
        return start;
    }






}
