package com.company;

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
