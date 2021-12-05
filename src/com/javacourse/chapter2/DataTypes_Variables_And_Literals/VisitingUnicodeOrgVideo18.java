package com.javacourse.chapter2.DataTypes_Variables_And_Literals;

public class VisitingUnicodeOrgVideo18 {
    public static void main(String[] args) {
        char x = 0x0920;
        System.out.println("करिशन");
        System.out.println(x);
        // ---------------------------------
        for(char c = 0x0900;c<=0x097F;c++){
            System.out.println(c);
        }
    }
}
