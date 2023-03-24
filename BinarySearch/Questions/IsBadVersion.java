package com.jay.BinarySearch.Questions;

public class IsBadVersion {
    public static void main(String[] args) {
            int ans = firstBadVersion(7);
        System.out.println(ans);
    }

    public static int firstBadVersion(int n) {
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=i;
        }
        int ans = binarySearch(arr);
        return ans;
    }
    static int binarySearch(int[] arr){
        int start=1;
        int end = arr.length;
        while (start<=end){
            //find middle element
            int mid = start + (end-start)/2;
            //If it is Bad
            if (IsBadVersion(mid)){
                end=mid-1;
            }
            //If not Bad
            else {
                start = mid + 1;
            }
        }
        return start;
    }

   static boolean IsBadVersion(int mid) {
       return mid > 5;
   }


}
