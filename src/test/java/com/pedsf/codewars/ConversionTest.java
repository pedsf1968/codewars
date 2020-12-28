package com.pedsf.codewars;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConversionTest {
    private Conversion conversion = new Conversion();

    @Test
    public void shouldConvertToRoman() {
        assertThat( conversion.solution(1990)).isEqualTo("MCMXC");
        assertThat( conversion.solution(1)).isEqualTo("I");
        assertThat( conversion.solution(4)).isEqualTo("IV");
        assertThat( conversion.solution(6)).isEqualTo("VI");
    }
}