package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

   @Test
   public void top3() {
      assertEquals(Arrays.asList("e", "d", "a"),    StringTools.top3("a a a  b  c c  d d d d  e e e e e"));
      assertEquals(Arrays.asList("e", "ddd", "aa"), StringTools.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
      assertEquals(Arrays.asList("won't", "wont"),  StringTools.top3("  //wont won't won't "));
      assertEquals(Arrays.asList("e"),              StringTools.top3("  , e   .. "));
      assertEquals(Arrays.asList(),                 StringTools.top3("  ...  "));
      assertEquals(Arrays.asList(),                 StringTools.top3("  '  "));
      assertEquals(Arrays.asList(),                 StringTools.top3("  '''  "));
      assertEquals(Arrays.asList("a", "of", "on"),  StringTools.top3(Stream
              .of("In a village of La Mancha, the name of which I have no desire to call to",
                      "mind, there lived not long since one of those gentlemen that keep a lance",
                      "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                      "coursing. An olla of rather more beef than mutton, a salad on most",
                      "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                      "on Sundays, made away with three-quarters of his income.")
              .collect(Collectors.joining("\n")) ));
   }

   @Test
   public void stripComments() throws Exception {
      assertEquals(
              "apples, pears\ngrapes\nbananas",
              StringTools.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
      );

      assertEquals(
              "a\nc\nd",
              StringTools.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
      );

   }


}