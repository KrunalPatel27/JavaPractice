package com.company;

public class InPlaceMedian {
    int[] arr= {2, 1, 5,4,2, 3, 1,4};
    /*         {2,1.5,2,3,2,2.5,2,2.5}
    {1,2,4,5,6}
    */
    int leftMedian;
    int rightMedian;
    int[] out = new int[arr.length];
    public InPlaceMedian(){
        this.findMedian();
    }

    private void findMedian() {
        int middle;

        for(int end =0; end< arr.length; end++ ){
            middle = end/2;
            //even
            if(end%2==1){
                sortRight(middle, end);
                out[end] = (arr[middle]+arr[middle+1])/2;
            }
            //odd
            else{
                sortRight(middle, end);
                out[end] = arr[middle];
            }
        }
    }

    private void sortRight(int middle, int end) {
        if(arr[end]>arr[middle]){

        }
    }
//    //insert end in a sorted array in place
//    private void insert( int end){
//        int val = arr[end];
//        int gap = end/2;
//        int pick = end/2;
//        while(pick >=0 || pick < end){
//            gap /=2;
//            if(arr[pick] > val){  // go left
//                pick -= gap;
//            }
//            else{  // go right
//                pick+= gap;
//            }
//        }
//    }

}
