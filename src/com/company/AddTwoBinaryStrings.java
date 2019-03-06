package com.company;
/*
*
Program to add two binary strings

Given two binary strings, return their sum (also a binary string).

Example:

Input:  a = "11", b = "1"
Output: "100"

We strongly recommend you to minimize your browser and try this yourself first
The idea is to start from last characters of two strings and compute digit sum one by one. If sum becomes more than 1, then store carry for next digits.
* */

public class AddTwoBinaryStrings {
    public static String addBinary(String a, String b) {

        // parse string to int with base 2 instead of 10
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);
        System.out.print(number0 + "  " + number1);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum); //returns the answer as a binary value;
    }
    public static void  main (String[] args){
        if(addBinary("11", "1").equals("100")) System.out.println("Works!!Success@Done");
        else System.out.println("Fails!!");
    }
}
