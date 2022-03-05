package com.javacourse.chapter23.JavaIOStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student1 {
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamClassWithFileInputStream {
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/PrintStreamClass.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        ){
            Student student = new Student();
            student.rollNo = Integer.parseInt(bufferedReader.readLine());
            student.name = bufferedReader.readLine();
            student.dept = bufferedReader.readLine();

            System.out.println("Roll Number: "+student.rollNo);
            System.out.println("Student Name: "+student.name);
            System.out.println("Student Department: "+student.dept);
        }
        catch (Exception e){

        }
    }
}
