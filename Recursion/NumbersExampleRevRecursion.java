package com.jay.Recursion;

public class NumbersExampleRevRecursion {
    public static void main(String[] args) {
//print numbers,write a function that takes  a number and prints it.
//        print first 5 numbers
print(1);

    }
//    Function calling other function
//    The body and the definition is the same just the name is different


static void print(int n) {
        if (n==5) {
            System.out.println(5);
            return;
        }
    System.out.println(n);
    print(n + 1);
}



//All the function calls go into the stack memory
//First main is called

//taking  a number printing,calling
//    Call the function itself





}
