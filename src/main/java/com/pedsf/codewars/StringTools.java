package com.pedsf.codewars;

import java.util.*;
import java.util.stream.Collectors;

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
    * What is the most asked question on CodeWars?
    * Can someone explain  "..."
    * You need to write  a function detect that will check if a string starts with  'Can someone explain'
    * case sensitive. Return true if so,false otherwise .
    * @param comment string to analyse
    * @return true or false
    */
   public static boolean detect (String comment){
      // your code
      return comment.startsWith("Can someone explain");
   }

   /**
    * All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must
    * start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic
    * naan and the chickadee is bringing chocolate cake.
    *
    * Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate
    * whether the beast is allowed to bring the dish to the feast.
    *
    * Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish
    * may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not
    * contain numerals.
    * @param beast the name of the beast
    * @param dish the name of the dish
    * @return true or false
    */
   public static boolean feast(String beast, String dish) {

      return beast.toLowerCase().charAt(0) == dish.toLowerCase().charAt(0)
            && beast.toLowerCase().charAt(beast.length()-1) == dish.toLowerCase().charAt(dish.length()-1);
   }

   public static String reverseWords(String str){
      List<String> strings = Arrays.asList(str.split(" "));
      Collections.reverse(strings);
      return String.join(" ",  strings);
   }

   public static String reverseWord(String str) {
      return new StringBuilder(str).reverse().toString();
   }

   public static int stringToNumber(String str) {
      return Integer.valueOf(str);
   }

}
