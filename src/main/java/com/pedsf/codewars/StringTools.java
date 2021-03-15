package com.pedsf.codewars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


   /**
    * Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of
    * the top-3 most occurring words, in descending order of the number of occurrences.
    *
     * @param s String to analyse
    * @return 3 most occuring words
    */
   public static List<String> top3(String stringToAnalyse) {
      Map<String,Integer> map = new HashMap<>();
      List<String> result = new ArrayList<>();

      // Your code here
      for(String s : stringToAnalyse.split(" ")) {
         if(map.containsKey(s)) {
            map.put(s,map.get(s)+1);
         }
      }

      map.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(3);


      return null;
   }

   /**
    * Remove comments symbols in string
    *
    * @param text to remove symbols
    * @param commentSymbols to be removed from string
    * @return the modified text
    */
   public static String stripComments(String text, String[] commentSymbols) {

      String regex = "";

      for(int i=0; i<commentSymbols.length; i++) {
         if(commentSymbols[i] == "!") {
            regex = commentSymbols[i] + ".*?";
         } else {
            regex = commentSymbols[i] + ".*?";
         }
         text = text.replaceAll(regex + "\n", "\n");
         text = text.replaceAll(regex, "");

      }



   return text;
   }
}
