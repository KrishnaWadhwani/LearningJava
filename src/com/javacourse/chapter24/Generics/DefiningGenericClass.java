package com.javacourse.chapter24.Generics;

class Data<T>{
    private T obj;
    public void setData(T obj){
        this.obj = obj;
    }
    public T getData(){
        return obj;
    }
}
public class DefiningGenericClass {
    public static void main(String[] args){
        Data<Integer> d = new Data<>(); // we don't have to write integer again in the diamond operator, earlier it was written but changed in later versions
        d.setData(10);
        System.out.println(d.getData());
    }
}
