/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitiy;

import java.util.List;

/**
 *
 * @author salem_alghanim
 */
public class TextBook {
    public String isbn;
    public String title;
    public String authors;
    public String publishedDate;
    public String publisher;
    public double price;
    public String img_url;
    public int est_male_copy;
    public int est_female_copy;
    public int est_Instructor_copy;
    
     public TextBook(String isbn, String title, String authors,
			String publishedDate, String publisher, double price,
			String img_url, int est_male_copy, int est_female_copy,
			int est_Instructor_copy) {
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.publishedDate = publishedDate;
		this.publisher = publisher;
		this.price = price;
		this.img_url = img_url;
		this.est_male_copy = est_male_copy;
		this.est_female_copy = est_female_copy;
		this.est_Instructor_copy = est_Instructor_copy;
	}
     
     public TextBook() {
    	this.isbn = null;
    	this.price =0.0;
    	this.est_female_copy=0;
    	this.est_Instructor_copy=0;
    	this.est_male_copy =0;
        
    }

    public TextBook(String isbn) {
        this.isbn = isbn;
    }

 
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    

    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getEst_male_copy() {
        return est_male_copy;
    }

    public void setEst_male_copy(int est_male_copy) {
        this.est_male_copy = est_male_copy;
    }

    public int getEst_female_copy() {
        return est_female_copy;
    }

    public void setEst_female_copy(int est_female_copy) {
        this.est_female_copy = est_female_copy;
    }

    public int getEst_Instructor_copy() {
        return est_Instructor_copy;
    }

    public void setEst_Instructor_copy(int est_Instructor_copy) {
        this.est_Instructor_copy = est_Instructor_copy;
    }
    
}
