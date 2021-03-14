package com.gabriellenoel.dayFive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class birthday {

    public static String whatBday(int a, int b, int c, int d, int e, int f, int g) {
        LocalDate date = LocalDate.of(a,b,c);
        LocalTime time = LocalTime.of(d,e,f,g);
        // LocalDateTime is used to store nanoseconds by combining LocalDate and LocalTime
        return LocalDateTime.of(date, time).toString();
    }

    public static void main(String[] args) {
        System.out.println(whatBday(1992, 7, 16, 8, 15, 30, 50 ));
    }



}
