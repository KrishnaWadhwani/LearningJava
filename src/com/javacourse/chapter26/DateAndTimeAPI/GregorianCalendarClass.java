package com.javacourse.chapter26.DateAndTimeAPI;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarClass {
    public static void main(String[] args){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.isLeapYear(2020);
        System.out.println(gregorianCalendar.get(Calendar.DATE));
        System.out.println(gregorianCalendar.get(Calendar.MONTH));
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_WEEK)); // In Calendar day of the week starts from 1 onwards not from 0
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_YEAR)); // In Calendar day of the week starts from 1 onwards not from 0
    }
}
