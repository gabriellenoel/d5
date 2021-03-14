package com.gabriellenoel.dayFive;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;

public class eachMonthLength {

    public static ArrayList<String> getLength(Year year) {

        ArrayList<String> lengthList = new ArrayList();

        for(int i = 1; i <= 12; i++) {
            Month currentMonth = year.atMonth(i).getMonth();
            String lengths = "There are " + currentMonth.length(year.isLeap()) + " days in " + currentMonth.name() + " of " + year + ".";
            lengthList.add(lengths);
            System.out.println(lengths);
        }
        System.out.println(lengthList.get(0));
        return lengthList;
    }

    public static void main(String[] args) {
        Year year = Year.of(2020);
        getLength(year);
    }
}
