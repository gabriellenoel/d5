package com.gabriellenoel.dayFive;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class timeZones {

    public static Instant convertToInstant(ZonedDateTime zoned) {
        Instant fromZoned = zoned.toInstant();
        System.out.println(fromZoned);
        return fromZoned;
    }

    public static ZonedDateTime convertToZonedDateTime(Instant instant) {
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        return zonedDateTime;
    }

    public static void main(String[] args){
        Instant instant = Instant.now();
        convertToZonedDateTime(instant);
        ZonedDateTime zoned = ZonedDateTime.now();
        convertToInstant(zoned);
    }
}
