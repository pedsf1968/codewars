package com.pedsf.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Kata {

   private Kata() {
   }

   /**
    * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    *
    * Example:
    *
    * highAndLow("1 2 3 4 5")  // return "5 1"
    * highAndLow("1 2 -3 4 5") // return "5 -3"
    * highAndLow("1 9 3 4 -5") // return "9 -5"
    * Notes:
    *
    * All numbers are valid Int32, no need to validate them.
    * There will always be at least one number in the input string.
    * Output string must be two numbers separated by a single space, and highest number is first.
    *
    * @param numbers a string of numbers
    * @return a string containing the greatest and the smallest
    */
   public static String highAndLow(String numbers) {

      int min = Arrays.stream(numbers.split(" "))
            .mapToInt(Integer::parseInt)
            .min()
            .getAsInt();

      int max = Arrays.stream(numbers.split(" "))
            .mapToInt(Integer::parseInt)
            .max()
            .getAsInt();

      return String.format("%d %d", max, min);
   }


   /**
    * In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will
    * consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find the
    * difference of the cuboids' volumes regardless of which is bigger.
    *
    * For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20.
    * Therefore, the function should return 8.
    * @param firstCuboid 3 integers
    * @param secondCuboid 3 integers
    * @return volume difference
    */
   public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
      //your code here !!
      return Math.abs( IntStream.of(firstCuboid).reduce(1, (a, b) -> a * b) - IntStream.of(secondCuboid).reduce(1, (a, b) -> a * b));
   }

}
