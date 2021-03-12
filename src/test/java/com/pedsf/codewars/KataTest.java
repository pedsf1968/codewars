package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
   @Test
   public void test1() {
      assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
   }


    @Test
    public void pressionMoléculaire() {
      assertEquals(0.7146511212121212, Kata.pressionMoléculaire(44, 30, 3, 2, 5, 50));
      assertEquals(5.099716666666667 ,Kata.pressionMoléculaire(60, 20, 10, 30, 10, 100));
   }

   @Test
   public void overTheRoad() {
      assertEquals(6, Kata.overTheRoad(1, 3));
      assertEquals(4, Kata.overTheRoad(3, 3));
      assertEquals(5, Kata.overTheRoad(2, 3));
      assertEquals(8, Kata.overTheRoad(3, 5));
      assertEquals(16, Kata.overTheRoad(7, 11));
      assertEquals(1999981L, Kata.overTheRoad(20, 1000000));
      assertEquals(596421736780L, Kata.overTheRoad(23633656673L, 310027696726L));
   }


   @Test
   public void dateNbDays() {
      assertEquals( "2035-12-26", Kata.dateNbDays(100, 150, 2));
      assertEquals( "2017-01-01", Kata.dateNbDays(100, 101, 0.98));
      assertEquals( "2024-07-03", Kata.dateNbDays(4281, 5087, 2));
      assertEquals( "2021-09-19", Kata.dateNbDays(4620, 5188, 2));
      assertEquals(Kata.dateNbDays(9999, 11427, 6), "2018-03-13");
      assertEquals(Kata.dateNbDays(3525, 4822, 3), "2026-04-18");
      assertEquals(Kata.dateNbDays(5923, 6465, 6), "2017-06-10");
      assertEquals(Kata.dateNbDays(4254, 4761, 8), "2017-05-22");
      assertEquals(Kata.dateNbDays(1244, 2566, 4), "2033-11-04");
      assertEquals(Kata.dateNbDays(6328, 7517, 5), "2019-05-25");
      assertEquals(Kata.dateNbDays(2920, 3834, 2), "2029-06-03");
      assertEquals(Kata.dateNbDays(7792, 8987, 4), "2019-07-09");
   }

}