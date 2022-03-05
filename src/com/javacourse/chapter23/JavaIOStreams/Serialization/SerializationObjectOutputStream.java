package com.javacourse.chapter23.JavaIOStreams.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Student(){

    }

    public Student(int rollNo, String name, float avg, String dept){
        this.rollNo = rollNo;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        Data = 500;
        t = 500;
    }

    public String toString(){
        return "\nStudent Details\n"+
                "\nRoll "+rollNo+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
}
public class SerializationObjectOutputStream {
    public static void main(String[] args){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/Serialization.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
            Student student = new Student(10, "Krishna", 93.0553f, "CSE");
            objectOutputStream.writeObject(student); // this will achieve serialization
        }
        catch (Exception e){

        }
    }
}
