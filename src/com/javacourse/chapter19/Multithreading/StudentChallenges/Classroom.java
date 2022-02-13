package com.javacourse.chapter19.Multithreading.StudentChallenges;

class WhiteBoard{
    String text;
    private static int totalStudents;
    int count;

    synchronized static public void attendance(){
        totalStudents++;
    }

    synchronized public void write(String message){
        System.out.println("Teacher Is Writing: "+message);
        while (count!=0){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        this.text = message;
        count = totalStudents;

        notify();
    }

    synchronized public String read(){
        while (count == 0){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        count--;
        if (count == 0){
            notify();
        }
        return this.text;
    }
}

class Teacher extends Thread{
    WhiteBoard whiteBoard;
    public Teacher(WhiteBoard whiteBoard){
        this.whiteBoard = whiteBoard;
    }
    String[] notes = {"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};

    @Override
    public void run(){
        for (int i = 0 ; i < notes.length - 1; i++){
            whiteBoard.write(notes[i]);
        }
    }
}

class Student extends Thread{
    String name;
    WhiteBoard whiteBoard;

    public Student(String name, WhiteBoard whiteBoard){
        this.name = name;
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run(){
        WhiteBoard.attendance();
        String text;
        do{
            text = whiteBoard.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }
        while (!text.equals("end"));
    }
}

public class Classroom {
    public static void main(String[] args){
        WhiteBoard whiteBoard = new WhiteBoard();
        Teacher teacher = new Teacher(whiteBoard);

        Student student1 = new Student("1. Jhon", whiteBoard);
        Student student2 = new Student("2. Ajay", whiteBoard);
        Student student3 = new Student("3. Krishna", whiteBoard);
        Student student4 = new Student("4. Smith", whiteBoard);

        teacher.start();

        student1.start();
        student2.start();
        student3.start();
        student4.start();
    }
}
