package com.javacourse.chapter26.DateAndTimeAPI;

import java.security.Permission;
import java.time.*;

public class JavaTimeClasses {
    public static void main(String[] args){
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        MonthDay monthDay = MonthDay.now();
        System.out.println(monthDay);

        Period period = Period.of(2, 2, 10);
        System.out.println(period.addTo(LocalDate.now())); // here 2 years 2 months 10 days are added to Current time

        Instant i = Instant.now(); // this is GMT
        System.out.println(i);
    }
}
