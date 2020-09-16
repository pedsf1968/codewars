package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeTest {

   @Test
   public void testBasic() {
      assertThat(Prime.isPrime(0)).isFalse();
      assertThat(Prime.isPrime(1)).isFalse();
      assertThat(Prime.isPrime(2)).isTrue();
      assertThat (Prime.isPrime(73)).isTrue();
      assertThat(Prime.isPrime(75)).isFalse();
      assertThat(Prime.isPrime(-1)).isFalse();
   }

   @Test
   public void testPrime() {
      assertThat( Prime.isPrime(3)).isTrue();
      assertThat( Prime.isPrime(5)).isTrue();
      assertThat( Prime.isPrime(7)).isTrue();
      assertThat( Prime.isPrime(41)).isTrue();
      assertThat( Prime.isPrime(5099)).isTrue();
   }

   @Test
   public void testNotPrime() {
      assertThat( Prime.isPrime(4)).isFalse();
      assertThat( Prime.isPrime(6)).isFalse();
      assertThat( Prime.isPrime(8)).isFalse();
      assertThat( Prime.isPrime(9)).isFalse();
      assertThat( Prime.isPrime(45)).isFalse();
      assertThat( Prime.isPrime(-5)).isFalse();
      assertThat( Prime.isPrime(-8)).isFalse();
      assertThat( Prime.isPrime(-41)).isFalse();
   }
}