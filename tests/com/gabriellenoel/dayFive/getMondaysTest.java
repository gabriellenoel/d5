package com.gabriellenoel.dayFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.gabriellenoel.dayFive.getMondays.mondayFinder;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

class getMondaysTest {

    @Test
    void mondayFinderTest() {
        String expectedDate = "2021-01-04";
        Month month = Month.of(1);
        assertEquals(expectedDate, mondayFinder(month).get(0));
    }
}