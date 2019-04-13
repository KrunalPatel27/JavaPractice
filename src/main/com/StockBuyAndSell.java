package com;

/**
 * Given a array of numbers representing the stock prices of a company in chronological order,
 * write a function that calculates the maximum profit you could have made from buying and selling that stock once.
 * You must buy before you can sell it.
 *
 * For example, given [9, 11, 8, 5, 7, 10], you should return 5,
 * since you could buy the stock at 5 dollars and sell it at 10 dollars.
 */
public class StockBuyAndSell {

    int[] arr = {9, 11, 8, 5, 7, 10};
    int max, diff, buy, sell;

    public StockBuyAndSell(){
        this.buy(arr);
    }

    private void buy(int[] arr) {
        int length = arr.length;
        max = arr[length-1];
        for(int i = length-2; i>=0; i--){
            if(arr[i]>max){
                max = arr[i];
            }else if((max - arr[i]) > diff){
                diff = max - arr[i];
                buy = arr[i];
                sell = max;
            }
        }
        System.out.println("Buy: "+ buy + " Sell: " + sell );
    }
}
