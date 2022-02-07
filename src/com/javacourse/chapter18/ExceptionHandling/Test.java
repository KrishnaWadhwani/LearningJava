package com.javacourse.chapter18.ExceptionHandling;

import java.io.IOException;

class TestingThrows{
    public static void show() throws Exception, IOException{
        throw new Exception();
    }
}

class MyOwnException extends Exception{
    @Override
    public String toString(){
        return "MyOwnException Occurred";
    }
}

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        try {
            throw new MyOwnException();
        } catch (MyOwnException e) {
            e.printStackTrace();
        }
    }
}
