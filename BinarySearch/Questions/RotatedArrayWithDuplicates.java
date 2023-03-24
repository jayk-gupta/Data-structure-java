package com.jay.BinarySearch.Questions;

public class RotatedArrayWithDuplicates {
    public static void main(String[] args) {

    }
    static int FindPivotWithDuplicates(int[] arr){
        int start =0;
        int end =arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            //4 Cases
            //Case-1
//         mid element > mid+1 element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //Case-2 : mid element < mid-1 element
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
//         Case-3
            //If elements at middle,start,end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //What if these elements at start and end were the pivots
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }
}
