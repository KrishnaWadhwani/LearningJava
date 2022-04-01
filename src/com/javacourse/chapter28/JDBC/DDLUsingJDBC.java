package com.javacourse.chapter28.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLUsingJDBC {
    public static void main(String[] args){
        try{
            Class.forName("org.sqlite.JDBC");

            Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter28/JDBC/univ.db");

            Statement statement = connection.createStatement();

            statement.executeUpdate("drop table Temp");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
