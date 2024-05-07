package com.questor.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class FirstDao {
    public static Connection getConnection(){
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questor","root","yashu1401");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return con;
    }
}
