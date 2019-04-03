package com.company;

public class ConwaysGame {
    /**
     * Any living cell with less than two live neighbours dies.
     * Any Live cell with two or three live neighbours remains living.
     * Any live cell with more than three live neighbours dies.
     * Any Dead cell with exactly three live neighbours becomes a live cell.
     *
     * You represent a  live cell wiht an (*) and a dead cell with a  (.)
     */
    char[][] gameBoard;
    int nBoardSize = 5;
    public ConwaysGame(){
        initializeGameBoard();
        nNextState(2);
    }

    private void nNextState(int iterations) {
        for(int i=0; i< iterations; i++){
            nextState();
            printBoard();
        }
    }

    private void initializeGameBoard() {
        gameBoard = new char[nBoardSize][nBoardSize];
        for(int i =0; i< nBoardSize; i++){
            for(int j =0; j< nBoardSize; j++){
                gameBoard[i][j] = '*';
            }
        }
        gameBoard[1][1] = '.';
        gameBoard[1][2] = '.';
        gameBoard[2][1] = '.';
        gameBoard[3][2] = '.';
        printBoard();
    }

    private void printBoard() {
        for(int i =0; i< nBoardSize; i++){
            for(int j =0; j< nBoardSize; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }


    public void nextState(){
        for(int i= 0; i<nBoardSize; i++){
            for(int j=0; j<nBoardSize; j++){
                int liveNeighbours = countLiveNeighbours(i,j);
                if(isAlive('*')) {
                    if (liveNeighbours < 2 || liveNeighbours > 3) dies(i,j);
                }else{
                    if(liveNeighbours == 3) alive(i,j);
                }
            }
        }
    }

    private int countLiveNeighbours(int x, int y) {
        int count=0;
        if(isValidIndex(x-1,y) && isAlive(gameBoard[x-1][y]))count++;
        if(isValidIndex(x+1,y) && isAlive(gameBoard[x+1][y]))count++;
        if(isValidIndex(x,y-1) && isAlive(gameBoard[x][y-1]))count++;
        if(isValidIndex(x,y+1) && isAlive(gameBoard[x][y+1]))count++;
        return count;
    }

    private boolean isValidIndex(int x, int y) {
        return x >= 0 && x < nBoardSize && y >= 0 && y < nBoardSize;
    }

    private boolean isAlive(char c) {
        return c == '*';
    }

    public void dies(int x, int y){
        gameBoard[x][y] = '.';
    }
    public void alive(int x, int y){
        gameBoard[x][y] = '*';
    }

}
