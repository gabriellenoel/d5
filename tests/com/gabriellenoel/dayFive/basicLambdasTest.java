package com.gabriellenoel.dayFive;

import static com.gabriellenoel.dayFive.basicLambdas.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assumptions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class basicLambdasTest {

    @Test
    @DisplayName("Checks that method sorts any set of strings by length.")
        public void testSortByLength() {
        String[] testStrings = {"wor", "wo", "w", "word"};
        String[] sortedStrings = {"w", "wo", "wor", "word"};
        assertArrayEquals(sortedStrings, sortByLength(testStrings));
    }


    @Test
    @DisplayName("Checks that method sorts any set of strings by length, but in reverse.")
    public void testSortByLengthReversed() {
        String[] testStrings = {"w", "wo", "wor", "word"};
        String[] sortedStrings = {"word", "wor", "wo", "w"};
        assertArrayEquals(sortedStrings, sortByLengthReversed(testStrings));
    }

    @Test
    @DisplayName("Checks that method sorts any set of strings alphabetically by first character only.")
    public void testSortAlphabetically() {
        String[] testStrings = {"bc", "bb", "a", "c"};
        String[] sortedStrings = {"a", "bc", "bb", "c"};
        assertArrayEquals(sortedStrings, sortAlphabetically(testStrings));
    }

    @Test
    @DisplayName("Checks that method sorts any set of strings by strings that contain 'e' first and everything else second.")
    public void testContainingEFirst() {
        String[] testStrings = {"start", "everybody eats", "exclusion", "hurt me with your worst intentions", "wrong direction"};
        String[] sortedStrings = {"everybody eats", "exclusion", "hurt me with your worst intentions", "wrong direction", "start"};
        assertArrayEquals(sortedStrings, containingEFirst(testStrings));
    }

    @Test
    @DisplayName("Checks that method sorts any set of strings by strings that contain 'e' first and everything else second.")
    public void testHelperE() {
        String[] testStrings = {"start", "everybody eats", "exclusion", "hurt me with your worst intentions", "wrong direction"};
        String[] sortedStrings = {"everybody eats", "exclusion", "hurt me with your worst intentions", "wrong direction", "start"};
        assertArrayEquals(sortedStrings, containingEFirst(testStrings));
    }

}
