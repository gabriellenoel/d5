package com.gabriellenoel.dayFive;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class prevThurs {

    public static LocalDate getLastThursday(LocalDate date) {

        int dayOfTheWeek = date.getDayOfWeek().getValue();
        int dayThurs = DayOfWeek.THURSDAY.getValue();
        int difference = dayThurs - dayOfTheWeek;

        LocalDate prevThursday;
        if(date.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
            prevThursday = date.minusDays(7);
        } else if (dayOfTheWeek < 4) {
            prevThursday = date.minusDays(7 - difference);
        } else {
            prevThursday = date.minusDays(7 + difference);
        }
        return prevThursday;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, 12, 5);
        LocalDate printLastThurs = getLastThursday(date);
        System.out.println(printLastThurs);
    }

}
