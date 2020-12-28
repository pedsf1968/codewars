package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
   void createPhoneNumber() {
      assertThat("(123) 456-7890").isEqualTo(StringTools.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
   }

}