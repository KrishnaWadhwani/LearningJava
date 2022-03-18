package com.javacourse.chapter24.Generics;

class MultipleParameterGeneric<T, V>{
    T obj1;
    V obj2;
    public void showTypes(){
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }
}

public class MultipleParameters{
    public static void main(String[] args){
        MultipleParameterGeneric<String, Integer> multipleParameter = new MultipleParameterGeneric<>();
        multipleParameter.obj1 = "Test";
        multipleParameter.obj2 = 10;
        multipleParameter.showTypes();
    }
}
