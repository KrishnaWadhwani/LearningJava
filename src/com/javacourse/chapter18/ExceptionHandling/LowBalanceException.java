package com.javacourse.chapter18.ExceptionHandling;

public class LowBalanceException extends Exception{
    @Override
    public String toString(){
        return "Balance Should Not Be Less Than 6000";
    }
}
