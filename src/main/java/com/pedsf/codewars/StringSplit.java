package com.pedsf.codewars;

public class StringSplit {

   /**
    * Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd
    * number of characters then it should replace the missing second character of the final pair with an underscore
    * ('_').
    *
    * Examples:
    *
    * StringSplit.solution("abc") // should return {"ab", "c_"}
    * StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
    * @param s String to be splitted
    * @return
    */
   public static String[] solution(String s) {

      s = (s.length() % 2 == 0)?s:s+"_";

      return s.split("(?<=\\G.{2})");
   }
}
