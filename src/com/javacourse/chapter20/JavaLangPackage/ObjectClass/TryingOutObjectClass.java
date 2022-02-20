package com.javacourse.chapter20.JavaLangPackage.ObjectClass;

class MyClass {
    int t = 10;
    public void run(String s){
        System.out.println(s+t);
    }
}

public class TryingOutObjectClass {
    public static void main(String[] args){
        MyClass myClass = new MyClass();
        
    }
}
