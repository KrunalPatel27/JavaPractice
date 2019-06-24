package com.amazon;

import java.util.Arrays;

public class MoviesOnFlight {
/**
 * You are on a flight and wanna watch two movies during this flight.
 You are given int[] movie_duration which includes all the movie durations.
 You are also given the duration of the flight which is d in minutes.
 Now, you need to pick two movies and the total duration of the two movies is less than or equal to (d - 30min).
 Find the pair of movies with the longest total duration. If multiple found, return the pair with the longest movie.

 e.g.
 Input
 movie_duration: [90, 85, 75, 60, 120, 150, 125]
 d: 250

 Output from aonecode.com
 [90, 125]
 90min + 125min = 215 is the maximum number within 220 (250min - 30min)
 */

    public MoviesOnFlight(){
        int[] moviesDuration = new int[]{90, 85, 75, 60, 120, 150, 125};
        int flightTime = 250;
        System.out.println(Arrays.toString(this.findMoviePairToWatch(moviesDuration, flightTime-30)));
    }

    private int[] findMoviePairToWatch(int[] moviesDuration, int duration) {
        int length = moviesDuration.length;
        Arrays.sort(moviesDuration);
        int left=0, right = length-1;
        int leftValue = moviesDuration[left];
        int leftLast = leftValue;
        int rightValue = moviesDuration[right];
        int rightLast = rightValue;
        int sum = leftValue+rightValue;

        System.out.println(Arrays.toString(moviesDuration));
        while(left+1<right){
            if(sum<duration){
                leftLast = leftValue;
                rightLast= rightValue;
                leftValue = moviesDuration[++left];
            }else if(sum > duration){
                leftLast = leftValue;
                rightLast = rightValue;
                rightValue = moviesDuration[--right];
            }else {
                break;
            }
            sum = leftValue + rightValue;
        }
        return new int[]{leftLast, rightLast};
    }


}
