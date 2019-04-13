package com;

/**
 * The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

 For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.

 You may also use a list or array to represent a set.
 */

public class PowerSet {
    char[] arr = {'a','b','c'};

    public PowerSet(){
        this.powerSetEval(arr, arr.length);
    }

    private void powerSetEval(char[] arr, int length) {
        int counter = (int)Math.pow(2, length);

        for(int i =0; i < counter; i++){
            for(int j=0; j < length; j++){
                if( (i&(1<<j)) >0){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }

    }

}
