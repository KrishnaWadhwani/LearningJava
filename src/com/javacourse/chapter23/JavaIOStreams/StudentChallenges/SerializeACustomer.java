package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.*;

class Customer implements Serializable {
    String customerId; // Customer id should be like: C1, C2, C3
    String name;
    String phoneNumber;
    static int count = 0;
    public Customer(){

    }
    public Customer(String name, String phoneNumber){
        count++;
        this.customerId = "C"+count;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        return "---Customer Data---"+
                "\nCustomer Id "+customerId+
                "\nName "+name+
                "\nPhone Number "+phoneNumber;
    }
}
public class SerializeACustomer {
    public static void main(String[] args){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/SerializeACustomer.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
            Customer list[] = {new Customer("Krishna", "25323523523"), new Customer("Jhon", "365236236"), new Customer("Ramu", "46346346346")};
            objectOutputStream.writeInt(list.length); // this is a must if we want to read all the objects
            for (Customer c : list){
                objectOutputStream.writeObject(c);
            }
        }
        catch (Exception e){

        }
    }
}
