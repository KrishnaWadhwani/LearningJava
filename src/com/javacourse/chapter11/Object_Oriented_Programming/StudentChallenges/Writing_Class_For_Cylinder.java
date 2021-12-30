package com.javacourse.chapter11.Object_Oriented_Programming.StudentChallenges;

class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*(radius*radius);
    }
    public double totalSurfaceArea(){
        return 2*(lidArea()+Math.PI*radius*height);
    }
    public double volume(){
        return Math.PI*(radius*radius)*height;
    }
}
public class Writing_Class_For_Cylinder {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        cylinder.radius=7;
        cylinder.height=10;
        System.out.printf("%.2f",cylinder.lidArea());
        System.out.print("\n");
        System.out.println("Lid Area: "+ cylinder.lidArea());
        System.out.println("Total Surface Area: "+ cylinder.totalSurfaceArea());
        System.out.println("Volume: "+ cylinder.volume());
    }
}
