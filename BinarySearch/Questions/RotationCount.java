package com.jay.BinarySearch.Questions;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(Count(arr));
    }
    public static int Count(int[] arr) {
        int pivot = FindPivot(arr);
        if (pivot == -1) {
            return 0;
        }
        else{
            return pivot+1;
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
                return (mid-1);
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
