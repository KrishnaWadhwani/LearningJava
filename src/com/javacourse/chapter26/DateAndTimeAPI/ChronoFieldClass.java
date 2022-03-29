package com.javacourse.chapter26.DateAndTimeAPI;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;

public class ChronoFieldClass {
    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));
    }
}
