/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entitiy.Semester;
import Repository.CourseRepository;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "SemesterConttroller", urlPatterns = {"/semester"})
public class SemesterConttroller extends HttpServlet {

  @Inject
  CourseRepository crepo;
  
  List <Semester> semester;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       semester = crepo.getSemester();
       request.setAttribute("semester", semester);
       request.getRequestDispatcher("select_semester.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            int sem_id = Integer.parseInt(request.getParameter("selected_semester"));
            
    }
    
}
