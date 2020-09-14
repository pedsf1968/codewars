package com.pedsf.codewars;

import java.util.HashMap;
import java.util.Map;

public class Line {
   private final static Integer BILL_100 = 100;
   private final static Integer BILL_50 = 50;
   private final static Integer BILL_25 = 25;
   private final static String RESPONSE_YES = "YES";
   private final static String RESPONSE_NO = "NO";

   /**
    * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
    * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
    * Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?
    *
    * Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.
    *
    * @param peopleInLine people change in line
    * @return response YES or NO
    */
   public static String Tickets(int[] peopleInLine)
   {
      Map<Integer,Integer> wallet = new HashMap<>();
      wallet.put(BILL_100,0);
      wallet.put(BILL_50,0);
      wallet.put(BILL_25,0);

      for( int i:peopleInLine) {
         int change = i - BILL_25;
         wallet.put(i,wallet.get(i)+1);
         while(change>0) {
            if(change>=BILL_50 && wallet.get(BILL_50)>0) {
               wallet.put(BILL_50,wallet.get(BILL_50)-1);
               change-=BILL_50;
            }
            if(change>=BILL_25 && wallet.get(BILL_25)>0) {
               wallet.put(BILL_25,wallet.get(BILL_25)-1);
               change-=BILL_25;
            } else {
               return RESPONSE_NO;
            }
         }

      }

      return RESPONSE_YES;
   }
}
