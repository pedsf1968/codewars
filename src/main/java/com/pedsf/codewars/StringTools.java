package com.pedsf.codewars;

import java.util.*;

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

   /**
    * You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and
    * switched their heads and tails around!
    * Save the animals by switching them back. You will be given an array which will have three values (tail, body, head).
    * It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).
    * Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions
    * with the same exact logics
    * @param arr
    * @return
    */
   public static String[] fixTheMeerkat(String[] arr) {
      List<String> stringList = Arrays.asList(arr);
      Collections.reverse(stringList);
      return stringList.toArray(new String[0]);
   }
}
