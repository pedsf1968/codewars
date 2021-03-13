package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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

   @Test
   public void sumListOfStringAndInteger() {
      assertEquals(10, IntTools.sumListOfStringAndInteger(Arrays.asList(5,"5")));
      assertEquals(22, IntTools.sumListOfStringAndInteger(Arrays.asList(9, 3, "7", "3")));
      assertEquals(42, IntTools.sumListOfStringAndInteger(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
      assertEquals(41, IntTools.sumListOfStringAndInteger(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
      assertEquals(45, IntTools.sumListOfStringAndInteger(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
      assertEquals(41, IntTools.sumListOfStringAndInteger(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
      assertEquals(61, IntTools.sumListOfStringAndInteger(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
   }

    @Test
    public void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};

        assertThat(3).isEqualTo(IntTools.findOutlier(exampleTest1));
        assertThat(206847684).isEqualTo( IntTools.findOutlier(exampleTest2));
        assertThat(0).isEqualTo(IntTools.findOutlier(exampleTest3));
    }

   @Test
   public void grow() {
      assertEquals(6, IntTools.grow(new int[]{1,2,3}));
      assertEquals(16, IntTools.grow(new int[]{4,1,1,1,4}));
      assertEquals(64, IntTools.grow(new int[]{2,2,2,2,2,2}));
   }

   @Test
   public void doubleIntArray(){
      assertArrayEquals(new int[] {2, 4, 6}, IntTools.doubleIntArray(new int[] {1, 2, 3}));
      assertArrayEquals(new int[] {8, 2, 2, 2, 8}, IntTools.doubleIntArray(new int[] {4, 1, 1, 1, 4}));
      assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, IntTools.doubleIntArray(new int[] {1, 1, 1, 1, 1, 1}));
   }

   @Test
   public void getAverage() {
      assertEquals(2,IntTools.getAverage(new int[] {2,2,2,2}));
      assertEquals(3,IntTools.getAverage(new int[] {1,2,3,4,5}));
      assertEquals(1,IntTools.getAverage(new int[] {1,1,1,1,1,1,1,2}));
   }
}