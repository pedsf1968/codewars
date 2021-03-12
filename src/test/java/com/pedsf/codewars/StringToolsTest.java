package com.pedsf.codewars;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {

   @Test
   void longest() {
      System.out.println("longest Fixed Tests");
      assertEquals("aehrsty", StringTools.longest("aretheyhere", "yestheyarehere"));
      assertEquals("abcdefghilnoprstu", StringTools.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
      assertEquals("acefghilmnoprstuy", StringTools.longest("inmanylanguages", "theresapairoffunctions"));

   }
/*
   @Test
   void check() {

      System.out.println(StringTools.check("[()]"));   // true
      System.out.println(StringTools.check("(()[])")); // true
      System.out.println(StringTools.check("([)]"));   // false
      System.out.println(StringTools.check("(("));     // false
      System.out.println(StringTools.check("[(()])")); // false

      System.out.println(StringTools.check("([(([[(([]))]]))])"));   // true
      System.out.println(StringTools.check("[](()()[[]])()[]([])")); // true
      System.out.println(StringTools.check("([((([(([]))])))))])")); // false
      System.out.println(StringTools.check("[](()()[[]])[][[([])")); // false
   }
*/
   @Test
   void fixedTest() {
      assertTrue(StringTools.feast("great blue heron","garlic nann"));
      assertTrue(StringTools.feast("chickadee","chocolate cake"));
      assertFalse(StringTools.feast("brown bear","bear claw"));
   }

   @Test
   public void reverseWords() {
      assertEquals("eating like I", StringTools.reverseWords("I like eating"));
      assertEquals("flying like I", StringTools.reverseWords("I like flying"));
      assertEquals("nice is world The", StringTools.reverseWords("The world is nice"));
   }

   @Test
   public void stringToNumber1(){
      assertEquals(1234 , StringTools.stringToNumber("1234"));
   }
   @Test
   public void stringToNumber2(){
      assertEquals(605 , StringTools.stringToNumber("605"));
   }
   @Test
   public void stringToNumber3(){
      assertEquals( 1405 , StringTools.stringToNumber("1405"));
   }
   @Test
   public void stringToNumber4(){
      assertEquals( -7 , StringTools.stringToNumber("-7"));
   }
}