package com.javacourse.chapter16.StaticAndFinal.StudentChallenge;

import java.util.Date;

class Student{
    Date date = new Date();
    private static int counter = 0;
    String universityName;
    String studentName;
    String Year = String.valueOf(date.getYear()+1900);
    Student(String universityName, String studentName){
        counter+=1;
        this.universityName = universityName;
        this.studentName = studentName;
    }
    public String getRollNumber(){
        return universityName+"-"+counter+"-"+Year+"-"+studentName;
    }
}
public class StudentRollNumber {
    static public void main(String[] args) {

        // Don't ask me How did these monkeys got admission into IIT!

        Student Ramu = new Student("IIT", "Ramu");
        System.out.println(Ramu.getRollNumber());

        Student Shamu = new Student("IIT", "Shamu");
        System.out.println(Shamu.getRollNumber());

        Student Changu = new Student("IIT", "Changu");
        System.out.println(Changu.getRollNumber());

        Student Mangu = new Student("IIT", "Mangu");
        System.out.println(Mangu.getRollNumber());
    }
}
