package com.javacourse.chapter5.Operators_And_Expressions.StudentChallenge;

import java.util.Scanner;

public class StudentChallenge_Cuboid {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        int length, breadth, height, totalArea, volume;
        System.out.println("Enter Length Of Cuboid: ");
        length = scin.nextInt();
        System.out.println("Enter Breadth Of Cuboid: ");
        breadth = scin.nextInt();
        System.out.println("Enter Height Of Cuboid: ");
        height = scin.nextInt();
        totalArea = 2*((length*breadth)+(length*height)+(breadth*height));
        volume = length*breadth*height;
        System.out.println("Total Area: "+totalArea);
        System.out.println("Volume: "+volume);
    }
}
