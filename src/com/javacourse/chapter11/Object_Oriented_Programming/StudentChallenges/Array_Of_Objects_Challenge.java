package com.javacourse.chapter11.Object_Oriented_Programming.StudentChallenges;

import java.util.Arrays;

class Student1 {
    String rollNumber;
    String name;
    String department;
    String[] subject;
    public Student1(String rollNumber, String name, String department, String... subject){
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
        this.subject = subject;
    }
    public String getRollNumber(){
        return rollNumber;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getSubject(){
        return Arrays.toString(this.subject);
    }
    public String toString(){
        return "\nName: "+getName()+"\nRoll Number: "+getRollNumber()+"\nDepartment: "+getDepartment()+"\nSubject: "+getSubject();
    }
}
public class Array_Of_Objects_Challenge {
    public static void main(String[] args){
        Student1[] students = new Student1[3];
        students[0] = new Student1("41CS", "Krishna", "CS", "DSA", "JAVA", "MATHS");
        students[1] = new Student1("42EC", "Ramu", "EC", "Arduino");
        students[2] = new Student1("43MATHS", "Lakshika", "MATHS", "Infinity");
        for (Student1 s : students){
            System.out.println(s);
        }
    }
}
