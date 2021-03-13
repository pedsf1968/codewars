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

   /**
    * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
    * Return the resulting string.
    *
    * @param numberString
    * @return
    */
   public static String fakeBin(String numberString) {

      return numberString.replaceAll("[01234]","0").replaceAll("[56789]","1");
   }
}
