package com.jay.BinarySearch.Questions;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e'};
       char ans = nextGreatestLetter(arr,'c');
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            //find middle element
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }



}
