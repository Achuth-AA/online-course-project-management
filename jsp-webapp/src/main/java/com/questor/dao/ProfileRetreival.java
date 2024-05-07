package com.questor.dao;

import com.questor.dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfileRetreival {

    public static User getuserDetails(String username,String password) {
        User user = null;
        try {
            Connection con = ProfileDao.getConnection();
            String query = "Select * from users Where username=? and password=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user = new User(

                        rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("phone")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return user;
    }




}
