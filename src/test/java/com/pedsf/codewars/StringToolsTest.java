package com.pedsf.codewars;

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

   @Test
   public void testSomething() {
      assertEquals("0", StringTools.fakeBin("4"));
      assertEquals("1", StringTools.fakeBin("5"));
      assertEquals("1", StringTools.fakeBin("9"));
      assertEquals("0000011111", StringTools.fakeBin("0123456789"));
   }

   @Test
   public void fixTheMeerkat1() {
      assertArrayEquals(new String[]{ "head", "body", "tail" },
            StringTools.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
   }

   @Test
   public void fixTheMeerkat2() {
      assertArrayEquals(new String[]{ "heads", "body", "tails" },
            StringTools.fixTheMeerkat(new String[]{ "tails", "body", "heads" }));
   }


   @Test
   public void fixTheMeerkat3() {
      assertArrayEquals(new String[]{ "top", "middle", "bottom" },
            StringTools.fixTheMeerkat(new String[]{ "bottom", "middle", "top" }));
   }

   @Test
   public void fixTheMeerkat4() {
      assertArrayEquals(new String[]{ "upper legs", "torso", "lower legs" },
            StringTools.fixTheMeerkat(new String[]{ "lower legs", "torso", "upper legs" }));
   }

   @Test
   public void fixTheMeerkat5() {
      assertArrayEquals(new String[]{ "sky", "rainbow", "ground" },
            StringTools.fixTheMeerkat(new String[]{ "ground", "rainbow", "sky" }));
   }

   @Test
   public void abbrevName() {
      assertEquals("S.H", StringTools.abbrevName("Sam Harris"));
      assertEquals("P.F", StringTools.abbrevName("Patrick Feenan"));
      assertEquals("E.C", StringTools.abbrevName("Evan Cole"));
      assertEquals("P.F", StringTools.abbrevName("P Favuzzi"));
      assertEquals("D.M", StringTools.abbrevName("David Mendieta"));
   }

   @Test
   public void countShifteron(){
      assertEquals(1, StringTools.countShifter("ON"));
   }
   @Test
   public void countShifterosIsUpdated(){
      assertEquals(2, StringTools.countShifter("OS IS UPDATED"));
   }
   @Test
   public void countShifterwhoIsWho(){
      assertEquals(2, StringTools.countShifter("WHO IS WHO"));
   }
   @Test
   public void countShifterjs(){
      assertEquals(0, StringTools.countShifter("JS"));
   }
   @Test
   public void countShifteriIiiIIii(){
      assertEquals(2, StringTools.countShifter("I III I III"));
   }
   @Test
   public void countShifterempty(){
      assertEquals(0, StringTools.countShifter(""));
   }
}