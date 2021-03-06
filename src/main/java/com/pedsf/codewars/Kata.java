package com.pedsf.codewars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
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


   public static double pressionMoléculaire(double molarMass1, double molarMass2, double givenMass1, double givenMass2, double volume, double temp) {
      double R = 0.082;
      double kelvinForDegree = 273.15;
      return (givenMass1/molarMass1 + givenMass2/molarMass2)*R*(temp+kelvinForDegree)/volume;
   }

   public static long overTheRoad(long address, long n) {
      if(address%2 == 0) {
         return 1+(2*n-address);
      } else {
         return 2*n-(address-1);
      }
   }

   /**
    * You have an amount of money a0 > 0 and you deposit it with an interest rate of p percent divided by 360 per day on
    * the 1st of January 2016. You want to have an amount a >= a0.
    *
    * Task:
    * The function date_nb_days (or dateNbDays...) with parameters a0, a, p will return, as a string, the date on which
    * you have just reached a.
    *
    * Example:
    * date_nb_days(100, 101, 0.98) --> "2017-01-01" (366 days)
    * date_nb_days(100, 150, 2.00) --> "2035-12-26" (7299 days)
    *
    * Notes:
    * The return format of the date is "YYYY-MM-DD"
    * The deposit is always on the "2016-01-01"
    * Don't forget to take the rate for a day to be p divided by 36000 since banks consider that there are 360 days in a year.
    * You have: a0 > 0, p% > 0, a >= a0
    * @param a0
    * @param a
    * @param p
    * @return
    */
   public static String dateNbDays(double a0, double a, double p) {
      SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
      Calendar cal = Calendar.getInstance();
      cal.set(2016,1,1);

      int nbJours =  (int) Math.ceil( Math.log(a/a0)/Math.log(p/36000+1) );

      try {
         cal.setTime( dateFormat.parse("2016-01-01"));
      } catch (ParseException e) {
         e.printStackTrace();
      }
      cal.add(Calendar.DATE, nbJours);

      return dateFormat.format(cal.getTime());
   }

   /**
    * Complete the function so that it finds the average of the three scores passed to it and returns the letter value
    * associated with that grade.
    *
    * Numerical Score	Letter Grade
    * 90 <= score <= 100	'A'
    * 80 <= score < 90	'B'
    * 70 <= score < 80	'C'
    * 60 <= score < 70	'D'
    * 0 <= score < 60	'F'
    * Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
    * @param s1
    * @param s2
    * @param s3
    * @return
    */
   public static char getGrade(int s1, int s2, int s3) {
      char[] score = {'A','B','C','D','F'};
      int[] minValues = {90,80,70,60,0};
      int i=0;

      while (minValues[i]>(s1+s2+s3)/3){
         i++;
      }

      return score[i];
   }

   /**
    * Issue Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
    * The pipes connecting your level's stages together need to be fixed before you recieve any more complaints.
    * Each pipe should be connecting, since the levels ascend, you can assume every number in the sequence after
    * the first index will be greater than the previous and that there will be no duplicates.
    *
    * Task Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.
    *
    * #Example:
    * Input: 1,3,5,6,7,8
    * Output: 1,2,3,4,5,6,7,8
    * @param numbers
    * @return
    */
   public static int[] pipeFix(int[] numbers) {

      int min = Arrays.stream(numbers).filter(num -> num !=0).min().getAsInt();
      int max =Arrays.stream(numbers).max().getAsInt() + 1;
      return IntStream.range(min, max).toArray();
   }

   /**
    * Create a function which answers the question "Are you playing banjo?".
    * If your name starts with the letter "R" or lower case "r", you are playing banjo!
    *
    * The function takes a name as its only argument, and returns one of the following strings:
    *
    * name + " plays banjo"
    * name + " does not play banjo"
    * @param name
    * @return
    */
   public static String areYouPlayingBanjo(String name) {
     return (name.toLowerCase().charAt(0) == 'r') ?
           name + " plays banjo" :
           name + " does not play banjo";
   }

}
