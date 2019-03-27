package com.company;

import java.util.Arrays;

public class BinaryInsert {
    int[]arr1 = {1,2,3,5,6,4};
    public BinaryInsert(){
        for (int i: arr1) {
            System.out.println(i);
        }
        insert(arr1.length-1);
        for (int i: arr1) {
            System.out.println(i);
        }
    }
    //insert end in a sorted array in place
    private void insert( int end){
        int val = arr1[end];
        int gap = end/2;
        int pick = end/2;
        while(pick >=0 || pick < end){
            gap /=2;
            if(pick ==0 || pick == end-1){

            }
            if(arr1[pick] > val){  // go left
                if(arr1[pick-1]<val){
                    insertAt(pick-1, end);
                    return;
                }
                pick -= gap;
            }
            else{  // go right
                if(arr1[pick+1] > val){
                    insertAt(pick+1, end);
                    return;
                }
                pick+= gap;
            }
            val = arr1[pick];

        }
        insertAt(pick, end);
    }

    private void insertAt(int i, int end) {
        System.out.println("call");
        int swap = arr1[end];
        int temp;
        while(i<=end){
//            System.out.println("print "+i);
            temp = arr1[i];
            arr1[i] = swap;
            swap = temp;
            i++;
        }
    }

}
