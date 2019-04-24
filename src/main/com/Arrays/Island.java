package com.Arrays;

public class Island {

    int[][] grid = new int[5][5];
    int[] iIndex = new int[]{0, -1, -1, -1};
    int[] jIndex = new int[]{-1, -1, 0, 1};

    public Island(){
        grid[0] = new int[] {0,1,0,1,0};
        grid[1] = new int[] {0,0,1,0,0};
        grid[2] = new int[] {1,0,0,0,0};
        grid[3] = new int[] {1,0,0,1,1};
        grid[4] = new int[] {1,0,0,1,0};
        System.out.println("Total number of Islands: " + findAllIslands(grid.length));
    }

    private int findAllIslands(int length) {
        int count =0;
        for(int i =0; i<length; i++){
            for(int j=0; j<length; j++){
                int curr = grid[i][j];
                if(curr == 1){
                    count += addCountIfValid(curr, i, j, length);
                }
            }
        }
        return count;
    }

    private int addCountIfValid(int curr1, int ith, int jth, int length) {
        int retCount =1;

        if(ith ==0 && jth ==0) return 1;

        if(ith ==0) {
            if(grid[ith][jth-1] ==1 ) --retCount;
        }
        else if(jth ==0) {
            if(grid[ith-1][jth] ==1 || grid[ith-1][jth+1] ==1 ) --retCount;
        }
        else if(jth == length-1) {
            if(grid[ith][jth-1]==1 || grid[ith-1][jth-1] ==1 || grid[ith-1][jth] ==1) --retCount;
        }
        else{
            if(grid[ith][jth-1]==1 || grid[ith-1][jth-1]==1 || grid[ith-1][jth] ==1 || grid[ith-1][jth+1] ==1) --retCount;
            if(grid[ith-1][jth] ==0 &&
                    (grid[ith-1][jth-1]==1||grid[ith][jth-1]==1)) --retCount;
        }

        return retCount;
    }


}
