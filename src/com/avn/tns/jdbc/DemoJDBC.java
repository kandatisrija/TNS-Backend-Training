package com.avn.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoJDBC {

    private static String USERNAME = "postgres";
    private static String PWD = "srija";    
    private static String URL =
            "jdbc:postgresql://localhost:5432/AVN";   

    public static void main(String args[])
            throws ClassNotFoundException, Exception {

        // loading the driver
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        // establish connection
        Connection con =
                DriverManager.getConnection(URL, USERNAME, PWD);
        System.out.println("connection established");

        // -------- execute the query --------
        String query =
                "insert into student values(103,'Abc','60')";

        // create statement
        PreparedStatement stmt = con.prepareStatement(query);

        // execute
        stmt.executeUpdate();
        System.out.println("1 record inserted");

        // close
        stmt.close();
        con.close();
    }
}
