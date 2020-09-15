package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class StringSplitTest {

   @Test
   public void testEvenString() {
      String s = "abcdef";
      String s1 = "HelloWorld";
      assertThat("[ab, cd, ef]").isEqualTo(Arrays.toString(StringSplit.solution(s)));
      assertThat("[He, ll, oW, or, ld]").isEqualTo(Arrays.toString( StringSplit.solution(s1)));
   }

   @Test
   public void testOddString() {
      String s = "abcde";
      String s1 = "LovePizza";
      assertThat("[ab, cd, e_]").isEqualTo(Arrays.toString( StringSplit.solution(s)));
      assertThat("[Lo, ve, Pi, zz, a_]").isEqualTo(Arrays.toString( StringSplit.solution(s1)));
   }
}