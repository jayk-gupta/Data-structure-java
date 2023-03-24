package com.jay.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//       int[] arr = {-18,-12,-4,2,3,4,17,18,22,48,78};
       int[] arr ={200,150,120,100,90,60,45,30,21,14,1,-5,-9,-22,-60};
       int target =-22;
       int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBinarySearch(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        //Find whether the array is sorted in ascending or descending
        boolean IsAsc = arr[start]<arr[end];

        while (start<=end){
            //find middle element
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
            if(IsAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }
                else {
                    start = mid+1;
                }
            }

            else {
                 if (target>arr[mid]){
                     end = mid-1;
                 }
                 else{
                     start = mid+1;
                 }

            }
        }
        return -1;
    }
}
