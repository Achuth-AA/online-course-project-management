package com.questor.controller;

import com.questor.dao.ProfileRetreival;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/SaveChanges")
public class SaveChangesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fName = req.getParameter("first-name");
        String userName= req.getParameter("last-name");
        String email=req.getParameter("email");
        String country=req.getParameter("country");

        HttpSession session = req.getSession();
        int userId = (int) session.getAttribute("userId");

        ProfileRetreival userDAO = new ProfileRetreival();
        if(userDAO.saveChanges(userId,fName,userName,email,country) != 0)
        {
                System.out.println("updated");
                resp.sendRedirect("./views/profile.jsp");
        }
    }
}