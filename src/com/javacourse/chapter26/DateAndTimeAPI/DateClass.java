package com.javacourse.chapter26.DateAndTimeAPI;

import java.util.*;

public class DateClass {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear()+1900);
    }
}
