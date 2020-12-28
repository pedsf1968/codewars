package com.pedsf.codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringTools {

   public static String longest (String s1, String s2) {

      // your code
      Set<Character> charSet = new HashSet<>();
      StringBuilder result = new StringBuilder();
      for(char c: (s1 + s2).toLowerCase().toCharArray()) {
         charSet.add(c);
      }

      for(Object o: charSet.stream().sorted().toArray()) {
         result.append(o);
      }

   return result.toString();
   }

   public static String createPhoneNumber(int[] numbers) {
      String str = Arrays.toString(numbers).replaceAll("\\[|\\]|,| ","");

      return "(" + str.substring(0,3) + ") " + str.substring(3,6) + "-"+  str.substring(6,10);
   }

}
