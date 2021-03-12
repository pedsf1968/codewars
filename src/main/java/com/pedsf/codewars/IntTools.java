package com.pedsf.codewars;

import java.util.Arrays;
import java.util.Collections;

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

}
