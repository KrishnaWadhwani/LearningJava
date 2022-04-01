package com.javacourse.chapter28.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DMLUsingJDBC {
    public static void main(String[] args){
        try{
            Class.forName("org.sqlite.JDBC");

            Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter28/JDBC/univ.db");
            Statement statement = connection.createStatement();

            statement.executeUpdate("update dept set dname = 'Chem' where deptno = 50");

            ResultSet resultSet = statement.executeQuery("select * from dept");

            while (resultSet.next()){
                System.out.print(resultSet.getInt("deptno")+" ");
                System.out.print(resultSet.getString("dname")+"\n");
            }

            statement.close();
            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
