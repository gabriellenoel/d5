package com.gabriellenoel.dayFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class learnJavaEight {

    public static List<String> createList(List<String> strings) {
        strings.add("the");
        strings.add("easiest");
        strings.add("way");
        strings.add("to");
        strings.add("put");
        strings.add("your");
        strings.add("own");
        strings.add("gifts");
        strings.add("down");
        strings.add("is");
        strings.add("to");
        strings.add("covet");
        strings.add("someone");
        strings.add("else's.");
        strings.add("ace");
        strings.add("ate");
        return strings;
    }
    public static List<String> filterAThree(List<String> strings) {
        return strings.stream().filter(s -> (s.charAt(0) == 'a' && s.length() == 3)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> filtered = new ArrayList<String>();
        System.out.println(filterAThree(filtered));
    }
}
