package com.questor.dao;

import com.questor.dto.UserDTO;

import java.sql.*;

public class UserDAO {

    private String dbUrl = "jdbc:mysql://localhost:3306/questor";
    private String dbUsername = "root";
    private String dbPassword = "0325";
    private Connection connection;

    public UserDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validate(String username, String password) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Users WHERE username = ? AND password = ?");
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public int registerUser(UserDTO user) throws SQLException {
        String query = "INSERT INTO Users (username, password, name, email, country, town, age) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getName());
        ps.setString(4, user.getEmail());
        ps.setString(5, user.getCountry());
        ps.setString(6, user.getTown());
        ps.setString(7, user.getBio());
        return ps.executeUpdate();
    }
}
