package com.javacourse.chapter23.JavaIOStreams;

import java.io.DataInputStream;
import java.io.FileInputStream;

class Student3 {
    int rollNo;
    String name;
    float avg;
    String dept;
}

public class DataInputStreamClassWithFileInputStream {
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/DataStreamClass.txt");
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        ){
            Student3 student3 = new Student3();
            student3.rollNo = dataInputStream.readInt();
            student3.name = dataInputStream.readUTF();
            student3.avg = dataInputStream.readFloat();
            student3.dept = dataInputStream.readUTF();

            System.out.println("Roll Number: "+student3.rollNo);
            System.out.println("Name: "+student3.name);
            System.out.println("Average: "+student3.avg);
            System.out.println("Dept: "+student3.dept);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
