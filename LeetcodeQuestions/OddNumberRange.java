package com.jay.LeetcodeQuestions;

public class OddNumberRange {
    public static void main(String[] args) {
        System.out.println(countOdds(3,13));
    }

    static int countOdds(int low, int high) {
        int total = high-low+1;
        if(low %2!=0 && high %2!=0){
            return total/2 +1;
        }
        else{
            return total/2;
        }
//        int count=0;
//        for (int i = low; i <=high ; i++) {
//            if (i%2!=0){
//                 count++;
//            }
//        }
//        return count;


    }
}
