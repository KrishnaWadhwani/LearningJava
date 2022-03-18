package com.javacourse.TestFiles;

class Super {
    public int test;
}

class Sub extends Super {
    public void showTest(){
        System.out.println(test);
    }
}
public class Test9 {
    public static void main(String[] args){
        Super sub = new Super();
    }
}