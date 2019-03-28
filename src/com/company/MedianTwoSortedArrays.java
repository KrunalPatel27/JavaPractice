package com.company;

public class MedianTwoSortedArrays {
    //int[] a = {1,2,3,4,5,6,7,8,9}; //count = 9
    //int[] b = {1,3,5,7,9}; //count = 5
    // a+b = {1,1,2,3,3,4,5,5,6,7,7,8,9,9} totalCount = 14
    //median = totalCount/2 => 7, so elem (7+8)/2 => (5+5)/2 => 5

    /*
    a = {5}
    b = {1,3,5,7,9}

     */
    int[] a = {1,3,5,7,9}; //count = 5
    int[] b = {1,2,3,4,5}; //count = 5
    int partition1, partition2;
    int lengthA = a.length, lengthB = b.length, totalLength = lengthA + lengthB;
    int start=0, end =0;
    //a+b = {1,3,5,5,6,7,7,8,9,9}
    public MedianTwoSortedArrays(){
        partition1 = lengthA/2 ;
        partition2 = (totalLength +1)/2 - partition1;
        findMedian();
        System.out.println(Math.max(a[partition1-1], b[partition2-1])
                + "left:right"
                + Math.min(a[partition1], b[partition2]) );
    }

    private void findMedian() {
        System.out.println(partition1 +" p1::p2 " +partition2);
        if(a[partition1-1] > b[partition2]){
            int diff = partition1 - (partition1/2);
            partition1 = partition1/2;
            partition2 +=diff;
            findMedian();
        }if(b[partition2-1]> a[partition1]){
            int diff = partition2 - (partition2/2);
            partition2 = partition2/2;
            partition1 +=diff;
            findMedian();
        }
        System.out.println(partition1 +"  p1:p2 " +partition2);
    }
}
