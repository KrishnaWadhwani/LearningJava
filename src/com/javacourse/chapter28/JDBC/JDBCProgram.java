package com.javacourse.chapter28.JDBC;

import java.sql.*;

public class JDBCProgram {
    public static void main(String[] args){
        try{
            // initialize the JDBC driver
            Class.forName("org.sqlite.JDBC");
            // establish the connection
            Connection con = DriverManager.getConnection("jdbc:sqlite:/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter28/JDBC/univ.db");
            // create statement
            Statement statement = con.createStatement();

            // use result set to store the results, use statement.executeQuery("SQL query")
            ResultSet resultSet = statement.executeQuery("select * from dept");
            // init variables
            int deptNo;
            String deptName;
            // run while loop in result set to get the data
            while (resultSet.next()){
                // getting the data
                deptNo = resultSet.getInt("deptno");
                deptName = resultSet.getString("dname");
                // printing it
                System.out.println(deptNo+" "+deptName);
            }
            statement.close();
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
