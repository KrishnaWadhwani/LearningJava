package com.javacourse.chapter12.Inheritance;

class Circle{
    public double radius;
    public double area(){
        return Math.PI * (radius * radius);
    }
    public double perimeter(){
        return 2 * (Math.PI * radius);
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area() * height;
    }
}
public class Practising_Inheritance {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();

        cylinder.radius = 7; // we are able to access radius because cylinder extends circle
        cylinder.height = 10; // we are able to access height because cylinder extends circle

        System.out.println("Volume: "+cylinder.volume());
        System.out.println("Area: "+cylinder.area());
        System.out.println("Circumference: "+cylinder.circumference());
    }
}
