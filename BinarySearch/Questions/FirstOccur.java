package com.jay.BinarySearch.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstOccur {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
//        System.out.println(Arrays.toString(Search(arr, 7)));
    }

    ArrayList<Long> find(long arr[], int n, int x) {
        long[] ans = {-1, -1};
//        checking for first occurence of 7
        ans[0] = searchIndex(arr, x, true);
//        If
        if (ans[0] != -1) {
            ans[1] = searchIndex(arr, x, false);
        }

        return null;
    }

    //    This function returns the value of target
    public static int searchIndex(long[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
//                for finding the first occurence
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;

    }
}
