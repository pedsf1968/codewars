package com.pedsf.codewars;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrollTest {

   @Test
   public void FixedTests() {
      assertThat("Ths wbst s fr lsrs LL!")
            .isEqualTo(Troll.disemvowel("This website is for losers LOL!"));
      assertThat("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd").
            isEqualTo( Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
      assertThat( "Wht r y,  cmmnst?")
            .isEqualTo( Troll.disemvowel("What are you, a communist?"));
   }
}