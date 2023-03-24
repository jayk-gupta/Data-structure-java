package com.jay.Sorting.Questions;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
     int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println((findDuplicate(arr)));
    }
    public static List<Integer> findDuplicate(int[] nums) {
        List<Integer> list =  new ArrayList<>();
        int i =0;
        while ( i <nums.length) {
                int correct =nums[i]-1;
                if(nums[i] != nums[correct] ) {
                    swap(nums, i, correct);
                }
                else {
                i++;
            }
        }
     //Finding duplicates
        for (int j = 0; j <nums.length; j++) {
            if ( nums[j]  != j+1 ){
                list.add(nums[j]);
            }
        }
        return list ;
    }
    static void swap(int[] arr,int index,int correctIndex){
        int temp = arr[index];
        arr[index]= arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
