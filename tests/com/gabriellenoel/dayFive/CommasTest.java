package com.gabriellenoel.dayFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.gabriellenoel.dayFive.Commas.*;

class CommasTest {

    @Test
    @DisplayName("Checks that array adds letters to list entries.")
    void sortOddsEvensTest() {
        String[] input = sortOddsEvens().toArray(new String[0]);

        String[] convertedNumbers = {
                "o1", "e2", "o3", "e4", "o5", "e6", "o7", "e8", "o9"
        };
        assertArrayEquals(convertedNumbers, input);
    }

    @Test
    @DisplayName("Checks that array combines to string")
    void combineTest() {
        String input = combine();
        String convertedInput = "o1,e2,o3,e4,o5,e6,o7,e8,o9";

        assertEquals(convertedInput, input);
    }
}