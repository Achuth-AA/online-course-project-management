package com.questor.dao;

import com.questor.dao.FirstDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao{

    public static boolean authenticate(String username,String password) {
        try {

            Connection con = FirstDao.getConnection();
            String query = "Select * from users where username=? and password=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}