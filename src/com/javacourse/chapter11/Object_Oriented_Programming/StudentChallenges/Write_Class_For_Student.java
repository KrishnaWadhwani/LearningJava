package com.javacourse.chapter11.Object_Oriented_Programming.StudentChallenges;

class Student{
    public String name;
    public String rollNumber;
    public String course;
    public double marks1, marks2, marks3;
    public double totalMarks(){
        return marks1+marks2+marks3;
    }
    public double average(){
        return (marks1+marks2+marks3)/3;
    }
    public char grade(){
        if (average() > 70){
            return 'A';
        }
        else if (average() > 60 && average() < 70){
            return 'B';
        }
        else if (average() > 50 && average() < 60){
            return 'C';
        }
        else if (average() > 40 && average() < 50){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public String getName(){
        return name;
    }
    public String getRollNumber(){
        return rollNumber;
    }
    public String getCourse(){
        return course;
    }
}
public class Write_Class_For_Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Krishna";
        student.rollNumber = "40";
        student.course = "JAVA";
        student.marks1 = 100;
        student.marks2 = 80;
        student.marks3 = 90;
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student Roll Number: "+student.getRollNumber());
        System.out.println("Student Course: "+student.getCourse());
        System.out.println("Total Marks: "+student.totalMarks());
        System.out.print("Average: ");
        System.out.printf("%.2f",student.average());
        System.out.print("\n");
        System.out.println("Grade: "+student.grade());
    }
}
