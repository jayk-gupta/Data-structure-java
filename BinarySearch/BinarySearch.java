package com.jay.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2,4, 8, 16, 23,33, 45,55,68,89};
   int ans = binarySearch(arr,89);
        System.out.println(ans);
    }
       //return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
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
