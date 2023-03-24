package com.jay.BinarySearch.Questions;

public class SearchInMoutainArray {
    public static void main(String[] args) {
         int[] arr ={1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr,3));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        //Find whether the array is sorted in ascending or descending
        boolean IsAsc = arr[start] < arr[end];
        while (start <= end) {
            //find middle element
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            //You are in descending part of the array
            //This may be the ans but check in left
            //start = 0 , end = mid
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (target<arr[start]){
            start=0;
            end-=1;
            return orderAgnosticBinarySearch(arr,target,start,end);
        }
        //If not found in left then search in right
        else {
            start +=1 ;
            end= arr.length-1;
            return orderAgnosticBinarySearch(arr,target,start,end);
        }
    }
}