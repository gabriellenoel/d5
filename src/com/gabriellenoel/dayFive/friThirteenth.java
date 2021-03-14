package com.gabriellenoel.dayFive;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class friThirteenth {

    public static boolean isFridayTheThirteenth(LocalDate date) {
        boolean result = (date.getDayOfWeek().equals(DayOfWeek.FRIDAY) && date.getDayOfMonth() == 13);
        return result;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 9, 13);
        System.out.println(date + " is Friday the Thirteenth? (True/False): " + isFridayTheThirteenth(date));
    }
}
