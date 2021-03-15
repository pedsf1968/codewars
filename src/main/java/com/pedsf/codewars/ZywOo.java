package com.pedsf.codewars;

import java.util.Arrays;
import java.util.Collections;

public class ZywOo {

   public static String warnTheSheep(String[] array) {
      Collections.reverse(Arrays.asList(array));
      int pos = Arrays.asList(array).indexOf("wolf");
      return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
   }

}
