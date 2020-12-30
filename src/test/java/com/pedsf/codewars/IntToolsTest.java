package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntToolsTest {


    @Test
    public void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};

        assertThat(3).isEqualTo(IntTools.findOutlier(exampleTest1));
        assertThat(206847684).isEqualTo( IntTools.findOutlier(exampleTest2));
        assertThat(0).isEqualTo(IntTools.findOutlier(exampleTest3));
    }
}