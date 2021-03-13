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
}