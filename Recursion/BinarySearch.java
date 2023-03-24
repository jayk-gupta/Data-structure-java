package com.jay.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
                 int [] arr ={1,2,4,9,7,12};
                 int target = 12;
        System.out.println(search(arr,target,0,arr.length-1));
    }
   static int search(int[] arr, int target, int s,int e){
        //Loop break condition in Binary search
        if (s>e){
            return -1;
        }
        //finding the middle element
        int m = s + (e-s)/2;
        //If found the ans, return it.
         if (arr[m] == target){
             return m;
         }
         //target < arr[m], end = mid -1
         if (target < arr[m]){
             //whenever you are calling a recursion call,
             // make sure to return the result of function call
             //of the return type
            return search(arr,target,s,m-1);
         }
         // else target > arr[m] , start = mid +1
         return  search(arr,target,m+1,e);
   }
}
