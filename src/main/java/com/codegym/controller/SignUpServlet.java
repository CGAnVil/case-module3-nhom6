package com.codegym.controller;

import com.codegym.dao.LoginDAO;
import com.codegym.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SignUpServlet", value = "/signup")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("rePassword");
        if (!password.equals(rePassword)){
            response.sendRedirect("login.jsp");
        }else {
            LoginDAO loginDAO = new LoginDAO();
            User user1 = loginDAO.checkSignUp(user);
            if (user1 == null){
                loginDAO.signUp(user,password);
                response.sendRedirect("login.jsp");
            }else {
                request.setAttribute("message","Tài khoản đã tồn tại");
            }
        }
    }
}
