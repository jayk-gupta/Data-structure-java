package com.jay.Sorting.Questions;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2};
    int ans = findDuplicate(arr);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
         int i =0;
        while ( i <nums.length) {
            if (nums[i] != i+1){
                int correct =nums[i]-1;
                if(nums[i] != nums[correct] ){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int index,int correctIndex){
        int temp = arr[index];
        arr[index]= arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
