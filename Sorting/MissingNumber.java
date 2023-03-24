package com.jay.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr ={4,0,2,1};
        System.out.println(MissingNum(arr));
    }
    static int MissingNum(int[] nums){
        int n = nums.length;
        //Cyclic sort
        cyclicsort(nums);
        //Search for missing number
        for (int i = 0; i < n; i++) {
            if (i !=nums[i]) {
                return i;
            }
        }
        return n;
    }
    //    0 to N
    static void cyclicsort(int[] arr){
        int i= 0;
        while(i<arr.length){
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
//    Swap
    static void swap(int[] arr,int index,int correctIndex){
        int temp = arr[index];
        arr[index]= arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
