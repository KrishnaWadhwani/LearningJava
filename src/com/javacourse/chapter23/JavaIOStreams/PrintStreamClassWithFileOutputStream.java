package com.javacourse.chapter23.JavaIOStreams;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student {
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamClassWithFileOutputStream {
    public static void main(String[] args){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/PrintStreamClass.txt");
                PrintStream printStream = new PrintStream(fileOutputStream);
        ) {
            Student s = new Student();
            s.rollNo = 10;
            s.name = "Jhon";
            s.dept = "CSE";
            printStream.println(s.rollNo);
            printStream.println(s.name);
            printStream.println(s.dept);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
