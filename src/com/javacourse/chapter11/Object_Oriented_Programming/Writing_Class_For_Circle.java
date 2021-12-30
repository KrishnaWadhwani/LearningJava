package com.javacourse.chapter11.Object_Oriented_Programming;

class Circle{
    public double radius;
    public double area(){
        return Math.PI * (radius * radius);
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}
public class Writing_Class_For_Circle {
    public static void main(String[] args){
        Circle circle = new Circle();
        Circle circle2 = new Circle();

        circle.radius = 2;
        circle2.radius = 8;

        System.out.println("Area: "+circle.area());
        System.out.println("Perimeter: "+circle.perimeter());
        System.out.println("Circumference: "+circle.circumference());

        System.out.println("Area2: "+circle2.area());
        System.out.println("Perimeter2: "+circle2.perimeter());
        System.out.println("Circumference2: "+circle2.circumference());
    }
}
