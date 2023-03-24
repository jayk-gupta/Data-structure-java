package com.jay.LeetcodeQuestions;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr)));
    }
    public static int[] shuffle(int[] nums) {
          int[] arr = new int[nums.length];
          int mid = (arr.length-1)/2;
        for (int i = 0; i<=mid; i++) {
               arr[2*i] = nums[i];
        }
        for (int i =mid+1,j=0; i <arr.length;j++, i++) {
            arr[2*j+1] = nums[i];
        }
       return arr;
    }

}
