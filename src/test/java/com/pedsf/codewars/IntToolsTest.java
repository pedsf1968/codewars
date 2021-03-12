package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToolsTest {

   @Test
   public void min_of_int_array() {
      assertEquals(-110, IntTools.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
      assertEquals(0, IntTools.min(new int[]{42, 54, 65, 87, 0}));
   }

   @Test
   public void max_of_int_array() {
      assertEquals(566, IntTools.max(new int[]{4,6,2,1,9,63,-134,566}));
      assertEquals(5, IntTools.max(new int[]{5}));
   }

   @Test
   public void numberToString() {
      assertEquals("67", IntTools.numberToString(67));
      assertEquals("123", IntTools.numberToString(123));
      assertEquals("999", IntTools.numberToString(999));
   }

   @Test
   public void sumPositiveNumbers() {
      assertEquals(15, IntTools.sumPositiveNumbers(new int[]{1,2,3,4,5}));
      assertEquals(13, IntTools.sumPositiveNumbers(new int[]{1,-2,3,4,5}));
      assertEquals(0, IntTools.sumPositiveNumbers(new int[]{}));
      assertEquals(0, IntTools.sumPositiveNumbers(new int[]{-1,-2,-3,-4,-5}));
      assertEquals(9, IntTools.sumPositiveNumbers(new int[]{-1,2,3,4,-5}));
   }
}