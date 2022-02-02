package com.javacourse.chapter15.InnerClasses;

class test1{
    int t = 10;
    public void test(){

    }
}
public class Test {
    int x1 = 10;
    public static void main(String[] args){
        int x = 11;
        test1 test1 = new test1(){
            @Override
            public void test(){
                System.out.println(x);
            }
        };
    }
}
