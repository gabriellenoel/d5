package com.gabriellenoel.dayFive;

import org.junit.jupiter.api.Test;
import static com.gabriellenoel.dayFive.birthday.whatBday;
import static org.junit.jupiter.api.Assertions.*;

class birthdayTest {

    @Test
    void whatBdayTest() {
        int year = 1995;
        int month = 6;
        int day = 7;
        int hour= 8;
        int minute= 9;
        int second= 10;
        int nanosecond= 11;
        String test = whatBday(year,month,day,hour,minute,second,nanosecond);
        assertEquals("1995-06-07T08:09:10.000000011", test);
    }
}