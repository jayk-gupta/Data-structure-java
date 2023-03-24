package com.jay.BinarySearch.Questions;

public class CeilingAndFloorOfaNumber{
    public static void main(String[] args) {
        int[] arr = { 2,3,5,9,14,16,18};
        int ans = Ceiling(arr,15);
        System.out.println(ans);
    }
    //Ceiling of a number: Smallest number greater than equal to target
    //return the index of the smallest number greater than target
    //but what if the target is greater than greatest number in the Array
    static int Ceiling(int[] arr, int target){
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            //find middle element
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    //Greatest number less than equal to target

    static int Floor(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            //find middle element
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
