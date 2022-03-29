package com.javacourse.chapter26.DateAndTimeAPI;

import java.time.ZonedDateTime;
import java.time.format.*;

public class DateTimeFormatterClass {
    public static void main(String[] args){
        ZonedDateTime localDateTime = ZonedDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
