/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entitiy.TextBook;
import Repository.BookRepository;
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
@WebServlet(name = "assignController", urlPatterns = {"/assign"})
public class assignController extends HttpServlet {

    @Inject
        BookRepository brepo;
    @Inject
        CourseRepository crepo;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<TextBook> book_list = brepo.getTextBooks();
        request.setAttribute("book", book_list);
        request.setAttribute("id", request.getParameter("id"));

        request.getRequestDispatcher("assign_tb.jsp").forward(request, response);

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            TextBook book;
            book = brepo.getTextBook(request.getParameter("book_isbn"));
            int sem_id = (int) request.getSession().getAttribute("semester_id");
            int cid= Integer.parseInt(request.getParameter("course_id"));
            crepo.updateCourseTextBook(sem_id, cid, book);
            response.sendRedirect("course");
    }


}
