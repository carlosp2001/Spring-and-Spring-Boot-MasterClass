package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void test() {
        boolean test = todos.contains("AWS"); // Result
        boolean test2 = todos.contains("GCP");
        // Assert for boolean values
        assertTrue(test, "Something went wrong");
        assertFalse(test2, "Something went wrong");
        // Entre algunos assert que se pueden utilizar se encuentran assertNull, assertNotNull

        assertArrayEquals(new int[] {1, 2}, new int[] {1, 2}, "Arrays are not the same");

        // Assert for numeric values
        assertEquals(3, todos.size(), "Something went wrong");
    }
}