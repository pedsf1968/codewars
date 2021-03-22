package com.pedsf.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

   /**
    * Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
    *
    * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
    * @param x
    * @return
    */
   public static int grow(int[] x){
      return Arrays.stream(x).reduce(1, (a,b)->a*b);
   }

   /**
    * Given an array of integers, return a new array with each value doubled.
    *
    * For example:
    *
    * [1, 2, 3] --> [2, 4, 6]
    * @param arr
    * @return
    */
   public static int[] doubleIntArray(int[] arr) {
         return Arrays.stream(arr).map(i -> i*2).toArray();
   }

   public static int getAverage(int[] marks){
      return IntStream.of(marks).sum()/marks.length;
   }

   /**
    * Your task is to find the first element of an array that is not consecutive.
    * By not consecutive we mean not exactly 1 larger than the previous element of the array.
    * E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's
    * the first non-consecutive number.
    * If the whole array is consecutive then return null2.
    * The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be
    * unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be
    * either too!
    * If you like this Kata, maybe try this one next: https://www.codewars.com/kata/represent-array-of-numbers-as-ranges
    * @param array
    * @return
    */
   static Integer findNonConsecutive(final int[] array) {
      for(int i=0; i<array.length-1; i++) {
         if(array[i]+1<array[i+1]) return array[i+1];
      }
      return null;
   }

   /**
    * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives
    * become positives.
    *
    * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
    * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
    * invert([]) == []
    * @param array
    * @return
    */
   public static int[] invertSigne(int[] array) {
      return Arrays.stream(array).map(operand -> -operand).toArray();
   }

   public static int[] arrayInitialize(int a, int b) {

       return java.util.stream.IntStream.rangeClosed(a, b).toArray();
    }

    /**
     * Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
     * First argument is an array of numbers and the second is the divisor.
     * @param numbers to test
     * @param divider
     * @return the numbers that can be divided
     */
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(num -> (num % divider)==0).toArray();
    }

}
