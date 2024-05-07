package com.questor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProfileDao {

    public static Connection getConnection(){
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Questor","root","root");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return con;
    }

}
