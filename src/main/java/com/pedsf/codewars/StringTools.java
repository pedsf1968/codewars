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

   /**
    * Write a function to convert a name into initials. This kata strictly takes two words with one space in between
    * them.
    * The output should be two capital letters with a dot separating them.
    * It should look like this:
    *
    * Sam Harris => S.H
    * Patrick Feeney => P.F
    * @param name
    * @return
    */
   public static String abbrevName(String name) {
      String [] initials = name.split(" ");
      return (initials[0].charAt(0) + "." + initials[1].charAt(0)).toUpperCase();
   }

   /**
    * You probably know that some characters written on a piece of paper, after turning this sheet 180 degrees, can be
    * read, although sometimes in a different way. So, uppercase letters "H", "I", "N", "O", "S", "X", "Z" after
    * rotation are not changed, the letter "M" becomes a "W", and Vice versa, the letter "W" becomes a "M".
    *
    * We will call a word "shifter" if it consists only of letters "H", "I", "N", "O", "S", "X", "Z", "M" and "W". After
    * turning the sheet, this word can also be read, although in a different way. So, the word "WOW "turns into the word
    * "MOM". On the other hand, the word "HOME" is not a shifter.
    *
    * Find the number of unique shifter words in the input string (without duplicates). All shifters to be counted, even
    * if they are paired (like "MOM" and "WOW"). String contains only uppercase letters.
    * @param st
    * @return
    */
   public static int countShifter(String st){
      int result = 0;
      String[] words = st.split(" ");

      Arrays.stream(words).distinct().forEach(word -> word.toUpperCase().replaceAll("[HINOSXZMW]",""));

      for(String word : words) {
         word = word.toUpperCase().replaceAll("[HINOSXZMW]","");
         if(word.equals("")) ++result;
      }
      return result;
   }
}
