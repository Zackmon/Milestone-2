/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entitiy.Corrdinator;
import Entitiy.Course;
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
@WebServlet(name = "CourseController", urlPatterns = {"/course"})
public class CourseController extends HttpServlet {

   @Inject
    CourseRepository crepo;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Corrdinator user = (Corrdinator) request.getSession().getAttribute("user");
            int sem_id;
            if(request.getParameter("selected_semester") != null)
            {
                sem_id = Integer.parseInt(request.getParameter("selected_semester"));
                request.getSession().setAttribute("semester_id", sem_id);

            }
            else
            {
                 sem_id = (int) request.getSession().getAttribute("semester_id");
            }
            List <Course> corrdintor_course = crepo.getCorrdinatorCourses(sem_id,user.getId());
            request.setAttribute("course", corrdintor_course);
            request.getRequestDispatcher("course_list.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
