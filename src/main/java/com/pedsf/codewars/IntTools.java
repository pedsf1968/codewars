package com.pedsf.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntTools {

   public static int min(int[] list) {
      return Arrays.stream(list).min().getAsInt();
   }

   public static int max(int[] list) {
      return Arrays.stream(list).max().getAsInt();
   }

   public static String numberToString(int num) {
      return String.valueOf(num);
   }

   public int cockroachSpeed(double x){
      return (int) Math.abs(x*100000/3600);
   }

   /**
    * You get an array of numbers, return the sum of all of the positives ones.
    *
    * Example [1,-4,7,12] => 1 + 7 + 12 = 20
    *
    * Note: if there is nothing to sum, the sum is default to 0.
    * @param arr
    * @return
    */
   public static int sumPositiveNumbers(int[] arr){
      return Arrays.stream(arr).filter(n -> n>0).sum();
   }


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

   /**
    * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
    *
    * @param mixed list og integer or string
    * @return the sum of list elements as a number.
    */
   public static int sumListOfStringAndInteger(List<?> mixed) {
      return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
   }
}
