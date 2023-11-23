package com.in28minutes.junit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {
    private MyMath math = new MyMath();


    @Test
    void calculateSum_Three() {
        // Ausencia de fallo se considera exitoso
        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
    }

    // {} => 0
    @Test
    void calculateSum_ZeroLengthArray() {
        // Ausencia de fallo se considera exitoso
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}