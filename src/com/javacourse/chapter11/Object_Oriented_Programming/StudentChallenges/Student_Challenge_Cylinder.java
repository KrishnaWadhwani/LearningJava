package com.javacourse.chapter11.Object_Oriented_Programming.StudentChallenges;

class CylinderChallenge{
    private double radius;
    private double height;
    public CylinderChallenge(double r, double h){
        if (r>=0){
            radius = r;
        }
        else{
            radius = 0;
        }
        if(h>=0){
            height = h;
        }
        else{
            height = 0;
        }
    }
    // getters and setters :-)
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
        if (r>=0){
            radius = r;
        }
        else{
            radius = 0;
        }
    }
    public void setHeight(double h){
        if (h>=0){
            height = h;
        }
        else{
            height = 0;
        }
    }
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
public class Student_Challenge_Cylinder {
    public static void main(String[] args){
        CylinderChallenge cylinder = new CylinderChallenge(9, 10);
        System.out.print("Total Surface Area: ");
        System.out.printf("%.2f", cylinder.totalSurfaceArea());
        System.out.println();
        System.out.print("Lid Area: ");
        System.out.printf("%.2f", cylinder.lidArea());
        System.out.println();
        System.out.print("Volume: ");
        System.out.printf("%.2f", cylinder.volume());
        System.out.println();
    }
}
