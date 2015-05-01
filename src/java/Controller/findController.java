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
import java.util.ArrayList;
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
@WebServlet(name = "findController", urlPatterns = {"/find"})
public class findController extends HttpServlet {
    @Inject
        BookRepository brepo;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean bool=brepo.checkIfExist(request.getParameter("isbn"));
        String isbn=request.getParameter("isbn");
        if(bool==true)
        {
            List<TextBook> one_book = new ArrayList <TextBook>();
            TextBook book = brepo.getTextBook(isbn);
            one_book.add(book);
            request.setAttribute("book", one_book);
            request.getRequestDispatcher("assign_tb.jsp").forward(request, response);

        }
        
        else
        {
          request.getRequestDispatcher("notfound.jsp").forward(request, response);
   
        }
    }   


}
