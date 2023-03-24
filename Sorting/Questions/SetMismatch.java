package com.jay.Sorting.Questions;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr ={8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(findmismatch(arr)));
    }
    public static int[] findmismatch(int[] nums) {
        int i =0;
        while ( i <nums.length) {
                int correct =nums[i]-1;
                if(nums[i] != nums[correct] ){
                    swap(nums,i,correct);
                }
                else{
                    i++;
                }
        }
                //searching for duplicate and missing number
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j+1){
                    return new int[] {nums[j],j+1};
                }

        }
        return new int[]{-1};
    }
    static void swap(int[] arr,int index,int correctIndex){
        int temp = arr[index];
        arr[index]= arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
