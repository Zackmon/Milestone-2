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
    public List<String> authors;
    public String publishedDate;
    public String publisher;
    public String Distributor;
    public double price;
    public String img_url;
    public int est_male_copy;
    public int est_female_copy;
    public int est_Instructor_copy;

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

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
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

    public String getDistributor() {
        return Distributor;
    }

    public void setDistributor(String Distributor) {
        this.Distributor = Distributor;
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
