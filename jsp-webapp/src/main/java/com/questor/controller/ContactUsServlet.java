package com.questor.controller;

import com.questor.dao.ContactUsDAO;
import com.questor.dto.ContactUsDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

//@WebServlet("/Contact")
public class ContactUsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String message = request.getParameter("message");

        ContactUsDTO contactUs = new ContactUsDTO();
        contactUs.setFirstName(firstName);
        contactUs.setLastName(lastName);
        contactUs.setEmail(email);
        contactUs.setPhoneNumber(phoneNumber);
        contactUs.setMessage(message);

        ContactUsDAO contactUsDAO = new ContactUsDAO();
        try{
            contactUsDAO.saveContactinfo(contactUs);
            response.sendRedirect("contactUs_success.jsp");
        } catch (SQLException e){
            e.printStackTrace();
            response.sendRedirect("contactUs_error.jsp");
        }

    }

}
