package com.javacourse.TestFiles;

class Outer{
    int y = 10;
    class Inner{
        int x = 100;
    }
}
public class Test6 {
    public static void main(String[] args){
        Outer.Inner i = new Outer().new Inner();
        System.out.println(i.x);
    }
}
