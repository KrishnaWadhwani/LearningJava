package com.javacourse.chapter26.DateAndTimeAPI;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneClass {
    public static void main(String[] args){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        // we cannot create a timezone, but we can get it from GregorianCalendar
        TimeZone timeZone = gregorianCalendar.getTimeZone();
        System.out.println(timeZone.getDisplayName());
        System.out.println(timeZone.getID());
    }
}
