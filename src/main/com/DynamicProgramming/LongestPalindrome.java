package com.DynamicProgramming;

public class LongestPalindrome {
    int[][] grid;
    int max =1;
    int maxX =0, maxY = 0;

    public LongestPalindrome(){
        System.out.println(longestPalindrome("bananas"));
    }

    public String longestPalindrome(String s) {
        int length= s.length();
        grid = new int[length][length];
        for(int i =0; i< length; i++){
            grid[i][i] = 1;
        }
        for(int i=1; i<length; i++){
            int x=i,y=0;
            for(int j=0; j<length-i; j++){
                if(s.charAt(j) == s.charAt(i+j) ){
                    grid[y][x] = grid[y+1][x-1] + 1;
                    if(max<grid[y][x]){
                        max = grid[y][x];
                        maxY = y;
                        maxX = x;
                    }
                }else{
                    grid[y][x] = 0;
                }
                y++;
                x++;
            }
        }
        return s.substring(maxY, maxX+1);
    }
}
