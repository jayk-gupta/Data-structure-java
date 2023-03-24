package com.jay.Recursion;

public class Function {
    public static void main(String[] args) {
            message();

    }
    static void message(){
        System.out.println("This is a message");
        message1();
    }  static void message1(){
        System.out.println("This is a message");
        message2();
    }  static void message2(){
        System.out.println("This is a message");
        message3();
    }  static void message3(){
        System.out.println("This is a message");
        message4();
    }  static void message4(){
        System.out.println("This is a message");
    }
}
