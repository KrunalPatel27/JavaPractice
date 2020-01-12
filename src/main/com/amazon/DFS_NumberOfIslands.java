package com.amazon;

public class DFS_NumberOfIslands {

    boolean[][] visited;
    int x[] = new int[]{-1, 0, 1, 0};
    int y[] = new int[]{0, -1, 0, 1};

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols;
        if(rows > 0)
            cols = grid[0].length;
        else
            return 0;

        visited = new boolean[rows][];
        for(int i =0; i< rows; i++){
            visited[i] = new boolean[cols];
        }
        int discoveredIslands =0;
        for(int i =0; i< rows; i++){
            for(int j =0; j<cols; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(i,j, rows, cols, grid);
                    discoveredIslands++;
                }else{
                    visited[i][j]= true;
                }
            }
        }
        return discoveredIslands;

    }

    public void dfs(int ithRow, int jthCol, int iMax, int jMax, char[][] grid){
        visited[ithRow][jthCol] = true;
        for(int n=0; n<4; n++){
            int xCord = jthCol + x[n];
            int yCord = ithRow + y[n];
            if(xCord>=0 && yCord >=0 && xCord <jMax && yCord < iMax){
                if(!visited[yCord][xCord] && grid[yCord][xCord] == '1'){
                    dfs(yCord, xCord, iMax, jMax, grid);
                }
            }
        }
    }

}
