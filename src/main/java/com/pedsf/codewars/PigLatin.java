package com.pedsf.codewars;


public class PigLatin {

   /**
    * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks
    * untouched.
    *
    * Examples
    * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    * pigIt('Hello world !');     // elloHay orldway !
    *
    * @param str String to modify
    * @return modified String
    */
   public static String pigIt(String str) {

      String[] result = str.split(" ");
      int i=0;
      for(String s : result) {
         if( s.matches("[a-zA-Z]*")) {
            result[i++] = s.substring(1) + s.substring(0, 1) + "ay";
         } else {
            result[i++] = s;
         }
      }

      return  String.join(" ",result);
   }
}
