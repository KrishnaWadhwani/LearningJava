package com.javacourse.TestFiles;

class Test11{
    public void test(){
        System.out.println("Test");
    }
}
class Test111 extends Test11{
    public void test(String s) {
        System.out.println("Test"+s);
    }
}
public class Test3 {
    public static void main(String[] args) {
        Test111 test111 = new Test111();
        test111.test("Test");
    }
}
