package com.gabriellenoel.dayFive;

import java.util.Arrays;
import java.util.Comparator;

public class basicLambdas {

    private static String[] strings = {
            "We have so many songs inside of us waiting to be sung. ",
            "The easiest way to block your own gifts is to covet someone else’s.",
            "Be willing to let go of who you think you are and who you want other people to think you are.",
            "Soften your heart.",
            "Simply being who I am is of service.",
            "Your light is going to be too bright for some people and that can’t matter."
    };

        /**
         * @param  strings  "make an array containing a few strings"
         * @return      strings sorted by length
         */
    public static String[] sortByLength(String[] strings) {
        // you can sort by user defined criteria using Comparator, in this case length of each string
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        return strings;
    }

    /**
     * @param  strings  "make an array containing a few strings"
     * @return      strings sorted by length but in reverse
     */
    public static String[] sortByLengthReversed(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
        return strings;
    }

    /**
     * @param  strings  "make an array containing a few strings"
     * @return      strings sorted alphabetically by first character only
     */
    public static String[] sortAlphabetically(String[] strings) {
        Arrays.sort(strings, (a, b) -> a.charAt(0) - b.charAt(0));
        return strings;
    }

    /**
     * @param  strings  "make an array containing a few strings"
     * @return      strings sorted alphabetically by first character only
     */
    public static String[] containingEFirst(String[] strings) {
        Arrays.sort(strings, (a, b) -> {
            if (a.toLowerCase().contains("e") && !b.toLowerCase().contains("e")) return -1;
            return 0;
        });
            return strings;
    }

    /**
     * @param  strings  "make an array containing a few strings"
     * @return      strings sorted alphabetically by first character only
     */
    public static String[] helperE(String[] strings) {
        Arrays.sort(strings, (a, b) -> basicLambdas.sortLogic(a,b));
        return strings;
    }

    public static int sortLogic(String a, String b) {
        if (a.toLowerCase().contains("e") && !b.toLowerCase().contains("e")) return -1;
            return 0;
            }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByLength(strings)));
        System.out.println(Arrays.toString(sortByLengthReversed(strings)));
        System.out.println(Arrays.toString(sortAlphabetically(strings)));
        System.out.println(Arrays.toString(containingEFirst(strings)));
    }
}
