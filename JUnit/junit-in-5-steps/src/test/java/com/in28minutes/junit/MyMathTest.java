package com.in28minutes.junit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {
    @Test
    void test() {
        int[] numbers = {1, 2, 3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        int expectedResult = 7;

        // Ausencia de fallo se considera exitoso
        assertEquals(expectedResult, result);
    }
}