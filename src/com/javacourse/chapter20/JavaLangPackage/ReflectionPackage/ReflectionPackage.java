package com.javacourse.chapter20.JavaLangPackage.ReflectionPackage;

import java.lang.reflect.*;

class My{
    // Properties
    private int a;
    protected int b;
    public int c;
    int d;
    // Constructors
    public My(){}
    public My(int x, int y){}
    // Methods
    public void display(String s1, String s2) {}
    public int show(int x, int y) {return 0;}
}

public class ReflectionPackage {
    public static void main(String[] args){
        // Without Creating Object
        Class c = My.class;
        // With Creating Object
        My m = new My();
        Class c1 = m.getClass();

        System.out.println("Information About My Class");

        System.out.println("Class Name");
        System.out.println(c.getName());
        System.out.println("Fields");
        Field[] field = c.getDeclaredFields();
        for (Field f : field){
            System.out.println(f);
        }
        System.out.println("Constructors");
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor f : constructors){
            System.out.println(f.getName());
        }
        System.out.println("Methods");
        Method[] methods = c.getMethods();
        for (Method f : methods){
            System.out.println(f);
        }
        System.out.println("Parameters Of Array");
        Parameter[] parameters = methods[0].getParameters();
        for (Parameter f : parameters){
            System.out.println(f);
        }
    }
}
