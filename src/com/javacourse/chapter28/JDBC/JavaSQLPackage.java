package com.javacourse.chapter28.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaSQLPackage {
    public static void main(String[] args){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter28/JDBC/univ.db");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");


            while (resultSet.next()){
                System.out.print(resultSet.getInt("roll")+" ");
                System.out.print(resultSet.getString("name")+" ");
                System.out.print(resultSet.getString("city")+" ");
                System.out.print(resultSet.getInt(4)+"\n");
            }

            statement.close();
            connection.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
