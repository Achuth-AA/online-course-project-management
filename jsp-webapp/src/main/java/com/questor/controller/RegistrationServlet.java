package com.questor.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import com.questor.dao.UserDAO;
import com.questor.dto.UserDTO;
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    private UserDAO userDAO;

    public void init() {
        userDAO = new UserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String town = request.getParameter("town");
        String bio = request.getParameter("bio");

        UserDTO newUser = new UserDTO(username, password, name, email, country, town, bio);

        try {
            userDAO.registerUser(newUser);
        } catch (Exception e) {
            // Handle exceptions
        }
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
