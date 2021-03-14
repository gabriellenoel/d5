package com.gabriellenoel.dayFive;

import java.time.*;
import java.util.ArrayList;

public class getMondays {

    public static ArrayList<String> mondayFinder(Month month) {
        Year year = Year.now();
        YearMonth yearMonth = year.atMonth(month);
        int monthLength = month.length(year.isLeap());

        ArrayList<String> mondayList = new ArrayList<String>();

        for (int i = 1; i <= monthLength; i++) {
            LocalDate day = yearMonth.atDay(i);
            if (day.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                mondayList.add(day.toString());
            }
        }
        System.out.println(mondayList);
        return mondayList;
    }

    public static void main(String[] args){
        Year year = Year.now();
        Month month = Month.of(1);
        YearMonth yearMonth = year.atMonth(month);
        ArrayList<String> found = mondayFinder(month);

        System.out.println("The Mondays in this month are: ");
        for(int i = 0; i <= found.size() - 1; i++) {
            System.out.println((i+1) + ") " + found.get(i));
        }

        System.out.println(found.get(0));
    }
}
