package com.pedsf.codewars;

import java.util.Arrays;

public class LongestConsec {

   /**
    * You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string
    * consisting of k consecutive strings taken in the array.
    *
    * Example:
    * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
    *
    * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
    *
    * Note
    * consecutive strings : follow one after another without an interruption
    * @param strarr string array
    * @param k number of consecutive string
    * @return longuest string of k successive string
    */
   public static String longestConsec(String[] strarr, int k) {
      if (strarr.length == 0 || k > strarr.length || k <= 0)
         return "";

      String longestStr = "";
      for (int index = 0; index < strarr.length - k + 1; index++) {
         StringBuilder sb = new StringBuilder();
         for (int i = index; i < index + k; i++) {
            sb.append(strarr[i]);
         }
         if (sb.toString().length() > longestStr.length()) {
            longestStr = sb.toString();
         }
      }
      return longestStr;
   }
}
