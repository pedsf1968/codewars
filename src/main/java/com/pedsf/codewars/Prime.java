package com.pedsf.codewars;

public class Prime {

   /**
    * Define a function that takes an integer argument and returns logical value true or false depending on if the
    * integer is a prime.
    *
    * Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors
    * other than 1 and itself.
    *
    * Requirements
    * You can assume you will be given an integer input.
    * You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).
    * NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might
    * time out. Numbers go up to 2^31 (or similar, depends on language version). Looping all the way up to n, or n/2, will be too slow.
    *
    * @param num to be tested
    * @return true if prime
    */
   public static boolean isPrime(int num) {
      return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
   }


   public static boolean isPrimeOld(int num) {

      if(num<2) {
         return false;
      } else if( num>2) {
         int divider = 2;
         int max=num/2;
         while(divider<=max) {
            if (num % divider == 0) {
               return false;
            }
            max=num/++divider;
         }
      }

      return true;
   }
}
