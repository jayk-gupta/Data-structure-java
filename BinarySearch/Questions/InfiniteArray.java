package com.jay.BinarySearch.Questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30,45};
        System.out.println(FindInRange(arr,15));
    }
    static int FindInRange(int[] arr,int target){
    //First find the range
     //first start with box of size two
     int start =0;
     int end =1;
     //condition for the target to  lie in the range
        // First we find the range where the target lies i.e. find start and end ,
        // then apply Binary Search on that part to find the index of the element
        while (target>arr[end]){
            int newStart = end+1;
            //Double the box value
            //end = PreviousEnd +sizeOfBox*2
            end = end + 2*(end-start+1);
            start = newStart;
        }
      return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
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
