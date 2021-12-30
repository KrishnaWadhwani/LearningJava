package com.javacourse.chapter11.Object_Oriented_Programming.StudentChallenges;

class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2*(length + breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
}
public class Writing_Class_For_Rectangle {
    public static void main(String[] args){
        //Creating Object
        Rectangle rectangle = new Rectangle();
        //Initializing Properties
        rectangle.length = 10.333;
        rectangle.breadth = 10.333;
        //Printing area, perimeter and Checking if it is a Square Or Not, using methods in Rectangle Class
        System.out.println("Area: "+rectangle.area());
        System.out.println("Perimeter: "+rectangle.perimeter());
        System.out.println("IsSquare: "+rectangle.isSquare());
    }
}
