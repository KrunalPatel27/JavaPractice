package com;

public class Sudoku {
    /**
     * Sudoku is a puzzle where you're given a partially-filled 9 by 9 grid with digits.
     * The objective is to fill the grid with the constraint that every row, column,
     * and box (3 by 3 subgrid) must contain all of the digits from 1 to 9.
     *
     * Implement an efficient sudoku solver.
     */
    // todo: Sudoku
    int [][] grid;
    int [] miniGrid;
    int size;
    public Sudoku(){
        this.size = 9;
        grid = new int[this.size][];
        this.grid[0] = new int []{1,9,0,0,0,0,4,0,0};
        this.grid[1] = new int []{4,0,0,8,0,5,0,0,0};
        this.grid[2] = new int []{7,0,0,0,0,4,6,3,2};
        this.grid[3] = new int []{6,0,2,7,0,9,0,4,0};
        this.grid[4] = new int []{0,1,0,0,0,0,0,9,0};
        this.grid[5] = new int []{0,8,0,4,0,3,1,0,6};
        this.grid[6] = new int []{2,6,1,5,0,0,0,0,3};
        this.grid[7] = new int []{3,0,0,9,0,1,0,0,6};
        this.grid[8] = new int []{0,0,5,0,0,0,0,4,1};
        
    }

}
