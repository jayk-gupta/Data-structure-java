package com.jay.LeetcodeQuestions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={-1,0};
       int[] ans =  twoSum(arr,-1);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
      int start=0;
      int end=numbers.length-1;
      while (start<=end){
            int  mid = start + (end-start)/2;
            if (numbers[mid]>=target){
                end=mid+1;
            }
            //arr[mid]<target
            else {
                int diff = target-numbers[mid];
                int ans2 = binarySearch(numbers,diff,0,mid-1);
                if (ans2 != -1){
                    arr[1]=mid+1;
                    arr[0]=ans2+1;
                    return arr;
                }
                else {
                    start =mid+1;
                }
            }
      }
     return arr;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            //find middle element
            int mid = start + (end-start)/2;
            //If target<number
            if (target<arr[mid]){
                end=mid-1;
            }
            //If target>number
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
