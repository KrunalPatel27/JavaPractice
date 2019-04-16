package com.Probability;

public class RandomNumbers1toK {
    int[] arr;
    public RandomNumbers1toK(int k){
        arr = new int[k];
        for(int i =1; i<=k; i++){
            arr[i] = i;
        }
        randomize();
    }

    private void randomize() {
    }
}
