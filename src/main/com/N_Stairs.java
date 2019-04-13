package com;

/*
* You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


* */
public class N_Stairs {

    static int [] custom;
    public static int climbStairsCustom(int n){
        if(n<0)return 0;
        if(n==0) return 1;
        int total =0;
        if(n-2>=0 &&custom[n-2] != 0)total+=custom[n-2];
        else total += climbStairsCustom(n-1);
        if(n-3>=0 && custom[n-3] != 0)total+=custom[n-3];
        else total += climbStairsCustom(n-2);
        custom[n-1] =total;
        return total;
    }

    public static int climbStairs(int n) {
        custom = new int[n];
        return climbStairsCustom(n);
    }

    public static void main(String[] args) {
        if(climbStairs(45) == 1836311903) System.out.println("Works!!Success@Done");
        else System.out.println("Fails!!");
    }


}
