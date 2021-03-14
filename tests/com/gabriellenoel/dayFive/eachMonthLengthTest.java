package com.gabriellenoel.dayFive;

import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.ArrayList;

import static com.gabriellenoel.dayFive.eachMonthLength.*;

import static org.junit.jupiter.api.Assertions.*;

class eachMonthLengthTest {

    @Test
    void getLengthTest() {
        Year year = Year.of(2020);
        ArrayList<String> length = getLength(year);
        assertEquals("There are 31 days in JANUARY of 2020.", length.get(0));
    }
}