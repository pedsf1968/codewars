package com.pedsf.codewars;

public class IntTools {

    /**
     * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
     * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
     * integer N. Write a method that takes the array as an argument and returns this "outlier" N.
     *
     * @param integers the list of integers to find the unique even or odd number
     * @return unique odd or even number found
     */
    static int findOutlier(int[] integers){
        int different = 0;
        int lastEvent = 0;
        int lastOdd = 0;

        for(int i : integers) {
            if(i%2==0) {
                different++;
                lastEvent = i;
            } else {
                different--;
                lastOdd = i;
            }
        }

        return (different < 0 ? lastEvent : lastOdd);
    }

}
