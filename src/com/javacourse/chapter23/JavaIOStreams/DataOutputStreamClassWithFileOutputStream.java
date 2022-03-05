package com.javacourse.chapter23.JavaIOStreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Student2 {
    int rollNo;
    String name;
    float avg;
    String dept;
}

public class DataOutputStreamClassWithFileOutputStream {
    public static void main(String[] args){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/DataStreamClass.txt");
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        ){
            Student2 student2 = new Student2();
            student2.rollNo = 10;
            student2.name = "Jhon";
            student2.avg = 90.03f;
            student2.dept = "CSE";

            dataOutputStream.writeInt(student2.rollNo);
            dataOutputStream.writeUTF(student2.name);
            dataOutputStream.writeFloat(student2.avg);
            dataOutputStream.writeUTF(student2.dept);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
