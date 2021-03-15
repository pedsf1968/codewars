package com.pedsf.codewars;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class GreedIsGood {

   private static List<String> greedyKey =  List.of("111","666","555","444","333","222","1","5");
   private static List<Integer> greedyValue =  List.of(1000,600,500,400,300,200,100,50);

   /**
    * Three 1's => 1000 points
    * Three 6's =>  600 points
    * Three 5's =>  500 points
    * Three 4's =>  400 points
    * Three 3's =>  300 points
    * Three 2's =>  200 points
    * One   1   =>  100 points
    * One   5   =>   50 point
    *
    * @param dice
    * @return
    */
   public static int greedy(int[] dice){
      int result = 0;

      StringBuilder sb = new StringBuilder();
      Arrays.stream(dice).sorted().forEach(value -> sb.append(value));

      for(int index=0; index<8; index++) {
         String target = greedyKey.get(index);
         int startIndex = sb.indexOf(target);
         int stopIndex = startIndex + target.length();

         if(startIndex != -1) {
            int quantity = StringUtils.countOccurrencesOf(sb.toString(),target);
            result+=greedyValue.get(index)*quantity;
            sb.replace(startIndex,stopIndex," ");

         }
      }

      //code here
      return result;
   }

}
