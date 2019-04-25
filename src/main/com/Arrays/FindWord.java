package com.Arrays;

/**
 * Given a 2D matrix of Characters and a target word, write a function that returns whether the word can be found
 * in the matrix by going left-to-right or up-to-down.
 *
 * For Example, given the following matrix:
 *
 *    [ ['F', 'A', 'C', 'I'],
 *      ['O', 'B', 'Q', 'P'],
 *      ['A', 'N', 'O', 'B'],
 *      ['M', 'A', 'A', 'A'] ]
 *
 *      and the target word 'FOAM', you should return true
 *      and the target word 'MASS', you should return true
 *      and if a target word is not found then return false
 */

public class FindWord {
    int length = 5;
    char[][] matrix= new char[length][length];
    String target = "";
    int targetLength;

    public FindWord(){
        initializeProblem();
        target = "MASS";
        targetLength = target.length();
        if(searchForTarget(target))
            System.out.println("Found a match!");
        else
            System.out.println("No match for target");
    }

    private boolean searchForTarget(String target) {
        if(searchUpDown()) return true;
        if(searchLeftRight()) return true;

        return false;
    }

    private boolean searchUpDown() {
        int limit = length - targetLength+1;

        for(int i=0; i<length; i++){
            for(int j=0; j< limit; j++){
                if(search(j, i, "UD"))return true;
            }
        }
        return false;
    }

    private boolean searchLeftRight() {
        int limit = length - targetLength +1;

        for(int i=0; i<length; i++){
            for(int j=0; j< limit; j++){
                if(search(i, j, "LR"))return true;
            }
        }
        return false;
    }


    private boolean search(int indexY, int indexX, String side) {
        if(side.equals("UD")){
            for(int i=0;i<targetLength; i++){
                if(target.charAt(i) != matrix[indexY++][indexX]) return false;
            }
        }else if(side.equals("LR")){
            for(int i=0;i<targetLength; i++){
                if(target.charAt(i) != matrix[indexY][indexX++]) return false;
            }
        }
        return true;
    }

    private void initializeProblem() {
        matrix[0] = new char[]{'A','B','K','E','B'};
        matrix[0] = new char[]{'F','Q','P','B','J'};
        matrix[0] = new char[]{'O','X','B','I','B'};
        matrix[0] = new char[]{'A','Z','B','D','G'};
        matrix[0] = new char[]{'M','M','A','S','S'};
    }
}
