package com.Arrays;

import java.util.*;

/**
 * Given a list of integers, return the largest product that can be made by multiplying any three integers.
 *
 * For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.
 *
 * You can assume the list has at least three integers.
 */
public class LargestProductOfThreeNumbers {
    int[] inputArray;

    ArrayList<Integer> largestPositives = new ArrayList<>();
    ArrayList<Integer> smallestNegatives = new ArrayList<>();

    public LargestProductOfThreeNumbers(){
        initialize();
        System.out.println(findLargestProduct(inputArray, inputArray.length));
    }

    private void initialize() {
        inputArray = new int[]{1,2,3,4,-2,-10,-5, 5, 2,0 ,-10, 3, 10};
        for(int i=0; i<3; i++){
            if(i <2) smallestNegatives.add(0);
            largestPositives.add(0);
        }
    }

    private int findLargestProduct(int[] inputArray, int length) {

        for(int i =0; i<length; i++){
            if(inputArray[i]<0){
                addNegative(inputArray[i]);
            }else {
                addPositive(inputArray[i]);
            }
        }
        System.out.print(smallestNegatives);
        System.out.println(largestPositives);
        return evaluate();
    }

    private int evaluate() {
        int negProduct = smallestNegatives.get(0)*smallestNegatives.get(1);
        int posProduct = largestPositives.get(0)*largestPositives.get(1);
        return negProduct>posProduct ? negProduct*largestPositives.get(2): posProduct*largestPositives.get(2);
    }

    private void addPositive(int val) {
        if(val > largestPositives.get(2)){
         largestPositives.remove(0);
         largestPositives.add(2,val);
        }else if(val > largestPositives.get(1)){
            largestPositives.set(0, largestPositives.get(1));
            largestPositives.set(1, val);
        }else if(val > largestPositives.get(0)){
            largestPositives.set(0, val);
        }
    }

    private void addNegative(int val) {
        if(val < smallestNegatives.get(1)){
            smallestNegatives.remove(0);
            smallestNegatives.add(val);
        }
        else if( val < smallestNegatives.get(0)){
            smallestNegatives.set(0, val);
        }
    }
}
