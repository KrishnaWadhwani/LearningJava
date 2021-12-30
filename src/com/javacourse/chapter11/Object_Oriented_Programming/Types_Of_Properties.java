package com.javacourse.chapter11.Object_Oriented_Programming;

/*
Will throw error: same class exists
class Rectangle {

}
*/
class Rectangle1{
    private double length;
    // read-write able
    public double getLength(){
        return length;
    }
    public void setLength(double l){
        length = l;
    }
}
class Student{
    private double rollNumber;
    // read able
    public double getRollNumber(){
        return rollNumber;
    }
}
class Producer{
    private double sharedData;
    // write able
    public void setData(double data){
        sharedData = data;
    }
}
public class Types_Of_Properties {
    public static void main(String[] args){

    }
}
