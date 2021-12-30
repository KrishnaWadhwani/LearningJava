package com.javacourse.chapter11.Object_Oriented_Programming;

import java.util.Random;

class Subject{
    private int subjectId;
    private String name;
    private int maxMarks;
    private int marksObtained;
    Random random = new Random();
    public Subject(String name, int maxMarks){
        this.subjectId = random.nextInt((1000000-100000)+1)+100000;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
    public void setMarksObtain(int marksObtained) {
        this.marksObtained = marksObtained;
    }
    public int getSubjectId() {
        return subjectId;
    }
    public boolean isQualified(){
        return marksObtained>=(maxMarks/10*40);
    }
    public String getName() {
        return name;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public int getMarksObtain() {
        return marksObtained;
    }
    public String toString(){
        return "\nSubjectID: "+subjectId+"\nName: "+name+"\nMarks Obtained: "+marksObtained;
    }
}
public class Array_Of_Objects {
    public static void main(String[] args){
        Subject subject[] = new Subject[3];
        subject[0] = new Subject("Java", 100);
        subject[1] = new Subject("DSA", 100);
        for (Subject s : subject){
            System.out.println(s);
        }
    }
}
