package com.gabriellenoel.dayFive;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import static com.gabriellenoel.dayFive.prevThurs.*;

class prevThursTest {

    @Test
    void getLastThursdayTest() {
        LocalDate today = LocalDate.of(2021, 03, 14);
        LocalDate lasThurs = LocalDate.of(2021, 03, 10);
        assertEquals(lasThurs, getLastThursday(today));
    }

}