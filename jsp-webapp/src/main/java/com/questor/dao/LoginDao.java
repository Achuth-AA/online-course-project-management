package com.questor.dao;

import com.questor.dao.FirstDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao{

    public static int authenticate(String email,String password) {
        int userId = 0;
        try {

            Connection con = FirstDao.getConnection();
            String query = "Select * from users where email=? and password=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                userId = rs.getInt("userid");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userId;
    }
}