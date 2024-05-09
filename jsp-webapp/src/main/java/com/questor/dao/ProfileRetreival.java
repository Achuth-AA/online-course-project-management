package com.questor.dao;

import com.questor.dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfileRetreival {

    public static User getUserDetails(int userId) {
        User user = null;
        try {
            Connection con = FirstDao.getConnection();
            String query = "Select * from users where userid = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, userId);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                user = new User(
                        rs.getString(4), // name
                        rs.getString(2), //username
                        rs.getString(5), //email
                        rs.getString(6) //country
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return user;
    }


    public boolean checkPassword(int userId, String password) {
        boolean check = false;
        Connection connection;
        ResultSet resultSet;
        PreparedStatement preparedStatement;

        try {
            connection = FirstDao.getConnection();
            String query = "select password from users where userid = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                String actualPassword = resultSet.getString(1);

                if (actualPassword.equals(password)) {
                    check = true;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return check;
    }

    public int changePassword(int userId, String password) {
        Connection connection;
        PreparedStatement preparedStatement;
        int res = 0;

        try {
            connection = FirstDao.getConnection();
            String query = "update users set password = ? where userid = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,password);
            preparedStatement.setInt(2, userId);

            res = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return res;
    }

    public int saveChanges(int userId, String name, String userName, String email, String country){
        int res=0;
        Connection connection;
        ResultSet resultSet;
        PreparedStatement preparedStatement;

        try {
            connection = FirstDao.getConnection();
            String query = "update users set name=?,username=?,email=?,country=? where userid = ?";

            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,userName);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,country);
            preparedStatement.setInt(5, userId);

            res=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

}
