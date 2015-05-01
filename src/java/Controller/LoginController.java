/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entitiy.Corrdinator;
import Repository.UsersRepository;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author salem_alghanim
 */
@WebServlet(name = "LoginController", urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {

   @Inject
    UsersRepository repo;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Corrdinator user;
            
            String username = (String)request.getParameter("username");
            String password = (String)request.getParameter("password");
            user = repo.getUser(username,password);
            if (user==null)
            {
                request.setAttribute("message","Username or password are invalid");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            else 
            {
               request.getSession().setAttribute("user", user);
               response.sendRedirect("semester");

            }
    }

    

}
