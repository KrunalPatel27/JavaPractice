package com.amazon;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class BFS_serverFarm {
    /**
     * You have a two dimensional grid representing servers,
     * zero means it's out and one means it's running.
     * For each one that's running, you can turn on all the adjacent ones,
     * so like how many days would it take to then on all the servers.
     *
     *
     the value 0 representing an empty cell;
     the value 1 representing a off server;
     the value 2 representing a on server.

     */


    LinkedList<Pair> queue = new LinkedList();




    public BFS_serverFarm(){
        System.out.println("Server Farm");
        int size = 4;
        int[][] grid = new int[size][];
        grid[0] = new int[]{2,1,1,0};
        grid[1] = new int[]{1,1,0,0};
        grid[2] = new int[]{0,1,1,0};
        grid[3] = new int[]{0,0,1,0};

        System.out.println("Number of Days it takes to start all servers: " +search(grid));

    }

    public int search(int[][]grid){
        int availableServers = 0;
        //initial run thro to queue all started servers
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i, j));
                }
                if(grid[i][j] ==1) {
                    availableServers += 1;
                }
            }
        }
        int days=0;
        while(queue.size()>0){
            LinkedList<Pair> temp = (LinkedList<Pair>) this.queue.clone();
            this.queue.clear();
            popByDay(grid, temp, grid.length);
            days++;
        }
        return days-1;
    }

    public void popByDay(int[][] grid, LinkedList<Pair> list,  int gridMax){
        while(list.size()>0){
            System.out.println("sdf");
            Pair temp = list.pop();
            bfs(grid, temp.row, temp.col, gridMax);
        }
    }

    // top, right, bottom, left
    int[] rowY= new int[]{1,0,-1,0};
    int[] colX= new int[]{0,1,0,-1};

    public void bfs(int[][] grid, int row, int col, int gridMax){
        for(int n=0; n<4; n++){
            int newRow = row + rowY[n];
            int newCol = col + colX[n];
            System.out.println(newCol +"sdf"+ newRow);
            if(newRow>= 0 && newRow < gridMax && newCol>=0 && newCol < gridMax){
                if(grid[newRow][newCol] ==1 ){
                    System.out.println("helelo");
                    queue.add(new Pair(newRow, newCol));
                }
                grid[newRow][newCol] =2;
            }
        }
    }

    public class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }




}
