package com.gabriellenoel.dayFive;

import java.util.ArrayList;
import java.util.Arrays;

public class Commas {

    public static ArrayList<String> sortOddsEvens() {

        String[] numbers = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };

        ArrayList<String> stringNumbers = new ArrayList<String>();

        Arrays.stream(numbers).forEach(num -> {

            int numConvert = Integer.parseInt(num);

            if(numConvert % 2 == 0) stringNumbers.add("e" + numConvert);
            else stringNumbers.add("o" + numConvert);

        });
        return stringNumbers;
    }

    public static String combine() {
        ArrayList<String> beforeCombine = sortOddsEvens();
        String combined = String.join(",", beforeCombine);
        return combined;
    }

    public static void main(String[] args) {
        System.out.println(sortOddsEvens());
    }

}
