package com.jay.Recursion;

public class PrintNumbers_recursive {
    public static void main(String[] args) {
        print1(1);
    }
    //body and definition is same , name is different
  static void print1(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //This is called tail recursion
      //last function called
        print1(n+1);
    }

}
