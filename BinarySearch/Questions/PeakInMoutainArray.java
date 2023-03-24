package com.jay.BinarySearch.Questions;

public class PeakInMoutainArray {
    public static void main(String[] args) {
         int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr,3));
    }

    public static int peakIndexInMountainArray(int[] arr,int target) {
     int start = 0;
     int end= arr.length-1;
        while (start<end){
           int mid = start + (end-start)/2;
            //It means you are in descending part of the array so
            //This may be the ans but more element bigger than this can lie in the left so check in left
            //start = 0 , end = mid
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            //arr[mid]<arr[mid+1]
            //You are in ascending part of the array
            //ans is going to lie in the right side
            //start = mid+1
            else{
                start = mid+1;
            }
        }
          return start; //return start or end as start == end
    }
}
