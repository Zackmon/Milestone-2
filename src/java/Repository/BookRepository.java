/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entitiy.TextBook;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author salem_alghanim
 */
@Singleton
public class BookRepository {
    public List<TextBook> textbooks_list;
    
    public List<TextBook> getTextBooks()
    {
        if(textbooks_list == null)
            insertData();
        return textbooks_list;
    }
    
    public TextBook getTextBook(String ISBN)
    {
        if(textbooks_list == null)
            insertData();
        
        TextBook requestedBook = null;
        for (TextBook textbooks_list1 : textbooks_list) {
            if(ISBN.equalsIgnoreCase(textbooks_list1.getIsbn()))
            {
                requestedBook=textbooks_list1;
                break;
            }
        }
        return requestedBook;
    }
    
    public void addTextBook (TextBook textbook)
    {
        if(textbooks_list == null)
            insertData();
        
        textbooks_list.add(textbook);
    }
    
    public boolean checkIfExist (String ISBN)
    {
        if(textbooks_list == null)
            insertData();
        
         for (TextBook textbooks_list1 : textbooks_list) {
             if (ISBN.equalsIgnoreCase(textbooks_list1.getIsbn())) {
                 return true;
             }
        }
   
        return false;
    }
    public void insertData() {
        textbooks_list = new ArrayList <TextBook>();
        
    }
    
}
