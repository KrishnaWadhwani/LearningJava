package com.javacourse.chapter26.DateAndTimeAPI;

import java.util.*;

public class MilliSeconds {
    public static void main(String[] args){
        System.out.println("Milliseconds passed from 1970 - currentTime");
        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        System.out.println(Long.MAX_VALUE);
    }
}
