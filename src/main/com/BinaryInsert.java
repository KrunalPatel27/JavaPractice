package com;

import java.util.Arrays;

public class BinaryInsert {
    int[]arr1 = {5,16,27,45,55,65,9};
    public BinaryInsert(){
        for (int i: arr1) {
            System.out.println("initial: "+i);
        }
        insert(arr1.length-1);
        for (int i: arr1) {
            System.out.println("final: "+i);
        }
    }
    //insert end in a sorted array in place
    private void insert( int end){
        int val = arr1[end];
        int gap = end/2;
        int pick = end/2;
        while(pick >=0 || pick <= end){
            gap /=2;
            if(gap ==0)gap=1;
            if(pick ==0 || pick == end){
                insertAt(pick,end);
                return;
            }
            if(arr1[pick] > val){  // go left
                if(arr1[pick-1]<val){
                    insertAt(pick, end);
                    return;
                }
                pick -= gap;
            }
            else{  // go right
                if(arr1[pick+1] > val){
                    insertAt(pick, end);
                    return;
                }
                pick+= gap;
            }
        }
        insertAt(pick, end);
    }

    private void insertAt(int i, int end) {
        int swap = arr1[end];
        int temp;
        while(i<=end){
            temp = arr1[i];
            arr1[i] = swap;
            swap = temp;
            i++;
        }
    }

}
