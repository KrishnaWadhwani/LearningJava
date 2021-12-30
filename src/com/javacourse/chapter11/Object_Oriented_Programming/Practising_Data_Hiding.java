package com.javacourse.chapter11.Object_Oriented_Programming;

class Rectangle{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        length = l;
    }

    public void validateThenSetLength(double l){
        if (l>=0){
            length = l;
        }
        else{
            length = 0;
        }
    }

    public void validateThenSetBreadth(double b){
        if (b>=0){
            breadth = b;
        }
        else{
            breadth = 0;
        }
    }

    public void setBreadth(double b){
        breadth = b;
    }

    public double area(){
        return getLength()*getBreadth();
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        return length == breadth;
    }
}
public class Practising_Data_Hiding {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();

        // upon an object we cannot access these variables because these variables are private
        // rectangle.length = 10; will give error
        // rectangle.breadth = 10; will give error

        rectangle.setBreadth(10.5);
        rectangle.setLength(10.5);
        rectangle.validateThenSetBreadth(-10.5);

        System.out.println("Area: "+rectangle.area());
        System.out.println("Perimeter: "+rectangle.perimeter());
        System.out.println("IsSquare: "+rectangle.isSquare());

        System.out.println("Length: "+rectangle.getLength());
        System.out.println("Breadth: "+rectangle.getBreadth());
    }
}
