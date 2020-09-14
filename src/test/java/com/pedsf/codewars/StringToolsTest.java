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
}