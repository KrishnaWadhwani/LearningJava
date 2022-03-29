package com.javacourse.chapter26.DateAndTimeAPI;

import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class LocalDateClass {
    public static void main(String[] args){
        /*Date date = new Date();
        date.setHours(21);
        System.out.println(date);*/

        LocalDate localDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        LocalDate localDate1 = LocalDate.of(2022, Month.MARCH, 27);
        LocalDate localDate2 = LocalDate.ofEpochDay(10000); // EpochDay is 1st Jan 1970
        // so in that date we are adding 10000 days and returning it

        LocalDate localDate3 = LocalDate.parse("2022-03-27");
        // format of parsing a date is YYYY-MM-DD

        LocalDate localDate4 = localDate3.plusMonths(12);
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
    }
}
