package com.javacourse.chapter28.JDBC;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatements {
    public static void main(String[] args){
        try{
            Class.forName("org.sqlite.JDBC");

            Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter28/JDBC/univ.db");
            PreparedStatement statement = connection.prepareStatement("select * from students where deptno=?");

            Scanner scin = new Scanner(System.in);
            System.out.print("Enter Department Number: ");
            int deptNo = scin.nextInt();

            statement.setInt(1, deptNo);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                System.out.print(resultSet.getInt("roll")+" ");
                System.out.print(resultSet.getString("name")+" ");
                System.out.print(resultSet.getString("city")+" ");
                System.out.print(resultSet.getInt(4)+"\n");
            }
            statement.close();
            connection.close();
        }
        catch (Exception e){

        }
    }
}
