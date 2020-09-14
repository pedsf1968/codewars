package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class LineTest {
   @Test
   public void test1() {
      assertThat("YES").isEqualTo(Line.Tickets(new int[] {25, 25, 50}));
   }
   @Test
   public void test2() {
      assertThat("NO").isEqualTo( Line.Tickets(new int []{25, 100}));
   }
}