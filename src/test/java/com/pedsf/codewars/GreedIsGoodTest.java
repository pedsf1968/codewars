package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GreedIsGoodTest {
   @Test
   public void testExample() {
      assertThat(250).isEqualTo(GreedIsGood.greedy(new int[]{5,1,3,4,1}));
      assertThat(1100).isEqualTo(GreedIsGood.greedy(new int[]{1,1,1,3,1}));
      assertThat(450).isEqualTo(GreedIsGood.greedy(new int[]{2,4,4,5,4}));
   }
}