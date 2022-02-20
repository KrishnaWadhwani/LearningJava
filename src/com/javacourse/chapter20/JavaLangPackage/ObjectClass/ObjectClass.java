package com.javacourse.chapter20.JavaLangPackage.ObjectClass;

class MyObject{
    @Override
    public String toString(){
        for (int i = 0 ; i < 10; i++){
            System.out.println("Krishna Wadhwani");
        }
        return "This is my Object";
    }
}

class MyObject2 extends MyObject{ // this is also indirectly inheriting from "Object" class

}

public class ObjectClass {
    public static void main(String[] args){
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;

        String s = new String("Krishna");
        String s1 = new String("Krishna");

        System.out.println(object1); // It will call toString() method automatically

        System.out.println(object1.equals(object2)); // it will check if the references are holding the same object or not
        System.out.println(object1.equals(object3)); // it will check if the references are holding the same object or not

        System.out.println(s.hashCode()); // unique number given to object is knows as hashCode
        System.out.println(s1.hashCode());


        // Overriding methods
        

        MyObject myObject = new MyObject();
        MyObject myObject2 = new MyObject();

        System.out.println(myObject);
        System.out.println(myObject.equals(myObject2));



        // getClass() same as type() in python


        System.out.println("Krishna".getClass());

        System.out.println("Wadhwani".getClass().getName());

    }
}
