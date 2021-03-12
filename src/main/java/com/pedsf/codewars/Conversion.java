package com.pedsf.codewars;

import org.springframework.util.StringUtils;

import java.util.Collections;

public class Conversion {
    private static final String[] romanSymbol = {"M","D","C","L","X","V","I"};
    private static final int[] intValues = {1000,500,100,50,10,5,1};

    /**
     * Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral
     * representation of that integer.
     *
     * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and
     * skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in
     * MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
     *
     * Example:
     *
     * conversion.solution(1000); //should return "M"
     *
     * Symbol    Value
     * I          1
     * V          5
     * X          10
     * L          50
     * C          100
     * D          500
     * M          1,000
     *
     * @param n
     * @return
     */
    public String solution(int n) {
        String result = "";
        if(n>0) {
            for(int i=0;i< romanSymbol.length;i++) {
                int step =n/intValues[i];
                if(step<5 && step>1) {
                    result+= String.join("", Collections.nCopies(5-step,romanSymbol[i+1]));
                }
                result+=romanSymbol[i];
                if(step>5) {
                    result+= String.join("", Collections.nCopies(9-step,romanSymbol[i+1]));
                }
                n-=step*intValues[i];
            }
        }

        return result;
    }
}
