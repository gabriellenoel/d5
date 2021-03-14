package com.gabriellenoel.dayFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.gabriellenoel.dayFive.learnJavaEight.filterAThree;

class learnJavaEightTest {

    @Test
    @DisplayName("Checks that method filters words with 3 letters beginning with A.")
    void filterAThreeTest() {
        List<String> filtered = new ArrayList<String>();
        filtered.add("ace");
        filtered.add("ate");

        List<String> input = new ArrayList<String>();
        input.add("the");
        input.add("easiest");
        input.add("way");
        input.add("to");
        input.add("put");
        input.add("your");
        input.add("own");
        input.add("gifts");
        input.add("down");
        input.add("is");
        input.add("to");
        input.add("covet");
        input.add("someone");
        input.add("else's.");
        input.add("ace");
        input.add("ate");

        assertArrayEquals(filtered, filterAThree(input));
    }

    private void assertArrayEquals(List<String> filtered, List<String> filterAThree) {
    }
}