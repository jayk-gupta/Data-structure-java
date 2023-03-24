package com.jay.LeetcodeQuestions.Array;
//Not submitted,interface list
import java.util.ArrayList;
import java.util.List;
public class KidwithGreatestCandies {
    public static void main(String[] args) {
      int[] arr = {2,3,5,1,3};
      ArrayList<Boolean> list = kidsWithCandies(arr,3);
        System.out.println(list);
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max=0;
        for (int i = 0; i <candies.length ; i++) {
             if (candies[i]>max){
                 max=candies[i];
             }
        }
        for (int i = 0; i < candies.length ; i++) {
            if(candies[i]+extraCandies >= max){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
       return list;
    }
}
