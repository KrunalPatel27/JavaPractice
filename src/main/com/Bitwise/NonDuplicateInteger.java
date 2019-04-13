package com.Bitwise;

/**
 * Given an array of integers where every integer occurs three times except for one integer,
 * which only occurs once, find and return the non-duplicated integer.
 *
 *For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.
 *
 *Do this in O(N) time and O(1) space.
 * One from the Geeks bcs this is a tricky problem
 */
public class NonDuplicateInteger {

    public NonDuplicateInteger(){
        int arr[] = {3, 2,1,2,2,3,3};
        int n = arr.length;
        System.out.println("The element with single occurrence is " + getSingle(arr, n));
    }
    int getSingle(int arr[], int n)
    {
        int ones = 0, twos = 0;
        int common_bit_mask;

        for(int i=0; i<n; i++ )
        {
            /*"one & arr[i]" gives the bits that are there in
            both 'ones' and new element from arr[]. We
            add these bits to 'twos' using bitwise OR*/
            twos = twos | (ones & arr[i]);

            /*"one & arr[i]" gives the bits that are
            there in both 'ones' and new element from arr[].
            We add these bits to 'twos' using bitwise OR*/
            ones = ones ^ arr[i];

            /* The common bits are those bits which appear third time
            So these bits should not be there in both 'ones' and 'twos'.
            common_bit_mask contains all these bits as 0, so that the bits can
            be removed from 'ones' and 'twos'*/
            common_bit_mask = ~(ones & twos);

            /*Remove common bits (the bits that appear third time) from 'ones'*/
            ones &= common_bit_mask;

            /*Remove common bits (the bits that appear third time) from 'twos'*/
            twos &= common_bit_mask;
        }
        return ones;
    }
}
