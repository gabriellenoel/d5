package com.gabriellenoel.dayFive;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.gabriellenoel.dayFive.friThirteenth.isFridayTheThirteenth;

import static org.junit.jupiter.api.Assertions.*;

class friThirteenthTest {

    @Test
    void isFridayTheThirteenthTest() {
        LocalDate date = LocalDate.of(2019, 9, 13);
        assertTrue(isFridayTheThirteenth(date));
    }
}