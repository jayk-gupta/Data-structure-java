package com.jay.BinarySearch.Questions;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        System.out.println(FindPivot(arr));
        int ans = findMin(arr);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int pivot = FindPivot(nums);
//    If you do not find the pivot that means array is not rotated
        if (pivot == -1){
            //just return 0th index element
            return nums[0];
        }
        else {
            return nums[pivot+1];
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
}
