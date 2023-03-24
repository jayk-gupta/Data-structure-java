package com.jay.BinarySearch.Questions;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
     int[] arr = {4,5,6,7,0,1,2};
        System.out.println(FindPivot(arr));
        int ans = search(arr,1);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
    int pivot = FindPivot(nums);
//    If you do not find the pivot that means array is not rotated
      if (pivot == -1){
          //just do normal binary search
          return binarySearch(nums,target,0,nums.length-1);
    }
      //If pivot is found,you have found two ascending sorted arrays
      if (nums[pivot]==target)
      {
          return pivot;
      }
       if (target>=nums[0]){
         return binarySearch(nums,target,0,pivot-1);
       }
       else {
           return binarySearch(nums,target,pivot+1, nums.length-1);
       }

}
    static int FindPivot(int[] arr){
     int start =0;
     int end =arr.length-1;
     while (start<=end){
      int mid = start + (end-start)/2;
      //4 Cases
         //Case-1
//         mid element > mid+1 element
         if (mid<end && arr[mid]>arr[mid+1]){
             return mid;
         }
         //Case-2 : mid element < mid-1 element
         if (mid>start && arr[mid]<arr[mid-1]){
             return mid-1;
         }
//         Case-3
         if (arr[start]>=arr[mid]){
             end =mid-1;
         }
         else {
             start=mid+1;
         }

     }
     return -1;
    }
    static int binarySearch(int[] arr,int target,int start, int end){
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
