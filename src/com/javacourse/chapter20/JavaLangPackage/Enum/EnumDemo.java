package com.javacourse.chapter20.JavaLangPackage.Enum;

enum Department {
//   0   1    2     3
    CS, IT, CIVIL, ECE;
    Department(){
        System.out.println(this.name());
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Department d = Department.CS;
        // ordinal starts from 0
        System.out.println(d.ordinal()); // will give the index of enum constant
        System.out.println(d.name());

        Department[] list = Department.values();
        for (Department x : list){
            System.out.println(x);
        }
    }
}
