package com.amazon;

import java.util.LinkedList;

public class BFS_rottingOranges {

    /**
     * In a given grid, each cell can have one of three values:

     the value 0 representing an empty cell;
     the value 1 representing a fresh orange;
     the value 2 representing a rotten orange.

     Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

     Return the minimum number of minutes that must elapse until no cell has a fresh orange.
        If this is impossible, return -1 instead.
     *
     */

    int[][] arr = {{2, 1,1}, {1,1,0}, {0,1,1}};
    int[][] arr1 = {{2, 1,1}, {0,1,1}, {1,0,1}};
    int xAxis[] = new int[]{-1, 0, 1, 0};
    int yAxis[] = new int[]{0, -1, 0, 1};

    public BFS_rottingOranges(){
        System.out.println(this.orangeRotting(arr1));
    }

    public int orangeRotting(int[][] grid){
        LinkedList<PairLocation> queue = new LinkedList<>();
        int goodOranges = 0;
        int yLength = grid.length;
        int xLength = grid[0].length;
        int elapsedTime = 1;

        // insert orignal rotten oranges for first round of BFS
        for(int y=0; y< yLength; y++){
            for (int x=0; x<xLength; x++){
                if(grid[y][x] == 2){
                    queue.add(new PairLocation(x,y));
                }else if(grid[y][x] == 1){
                    goodOranges++;
                }
            }
        }
        int newX, newY, currRoundQueue;
        currRoundQueue = queue.size();
        while(goodOranges != 0){
            if(currRoundQueue ==0){
                elapsedTime++;
                currRoundQueue = queue.size();
            }
            PairLocation temp = queue.pollFirst();
            currRoundQueue--;
            if(temp == null)break;
            for(int i=0; i<4; i++){
                newX = temp.x + xAxis[i];
                newY = temp.y + yAxis[i];
                if(newX>=0 && newY>=0 && newX<xLength & newY<yLength){
                    if(grid[newY][newX]==1){
                        grid[newY][newX] =2;
                        queue.add(new PairLocation(newX, newY));
                        System.out.println(goodOranges + "sdfd");
                        goodOranges--;
                    }

                }
            }
        }

        for(int y=0; y< yLength; y++){
            for (int x=0; x<xLength; x++){
               if(grid[y][x]==1)
                   return -1;
            }
        }



        return elapsedTime;
    }

    class PairLocation {
        int x, y;
        PairLocation(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

}
