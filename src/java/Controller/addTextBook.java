/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entitiy.TextBook;
import Repository.BookRepository;
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
@WebServlet(name = "addTextBook", urlPatterns = {"/addManual"})
public class addTextBook extends HttpServlet {
    @Inject
    BookRepository brepo;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("AddTextBook.jsp").forward(request, response);

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            TextBook book = new TextBook();
            book.setIsbn(request.getParameter("Book ISBN"));
            book.setTitle(request.getParameter("Book Title"));
            book.setAuthors(request.getParameter("Book Authors"));
            book.setPublishedDate(request.getParameter("Book Date"));
            book.setPublisher(request.getParameter("Book Publisher"));
            book.setPrice(Double.parseDouble(request.getParameter("Book Price")));
            book.setImg_url(request.getParameter("Book Image"));
            brepo.addTextBook(book);
            response.sendRedirect("semester");

            
    }

  

}
