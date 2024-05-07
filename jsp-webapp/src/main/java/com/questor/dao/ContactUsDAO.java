package com.questor.dao;

import com.questor.dto.ContactUsDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactUsDAO {

    public void saveContactinfo(ContactUsDTO contactUs) throws SQLException{
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = DataSource.getConnection();
            String query = "insert into contact_us(first_name, last_name, email, phone_number,message) values (?,?,?,?,?)";
            preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1,contactUs.getFirstName());
            preparedStatement.setString(2,contactUs.getLastName());
            preparedStatement.setString(3,contactUs.getEmail());
            preparedStatement.setString(4,contactUs.getPhoneNumber());
            preparedStatement.setString(5,contactUs.getMessage());

            preparedStatement.executeUpdate();
        } finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(con != null) {
                con.close();
            }
        }
    }

}
