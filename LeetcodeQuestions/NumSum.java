package com.jay.LeetcodeQuestions;

public class NumSum {
    public static void main(String[] args) {
        System.out.println(addDigits(193));
    }
  static int addDigits(int num) {
     int sum=0;
       do {
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
//            if (sum < 10) {
//                return sum;
//            }
           num=sum;
            sum=0;
        }while(num>9);
         return num;

  }

}
