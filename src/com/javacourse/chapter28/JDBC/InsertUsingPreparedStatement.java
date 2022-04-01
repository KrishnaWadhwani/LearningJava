package com.javacourse.chapter28.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {
    public static void main(String[] args){
        try{
            Class.forName("org.sqlite.JDBC");

            Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter28/JDBC/univ.db");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into students values(?,?,?,?)");

            Scanner scin = new Scanner(System.in);
            System.out.print("Roll Number: ");
            int rollNumber = scin.nextInt();
            System.out.print("Name: ");
            scin.nextLine();
            String name = scin.nextLine();
            System.out.print("City: ");
            String city = scin.nextLine();
            System.out.print("Dept No: ");
            int deptNo = scin.nextInt();

            preparedStatement.setInt(1, rollNumber);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, city);
            preparedStatement.setInt(4, deptNo);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
