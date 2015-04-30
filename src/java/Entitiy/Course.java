/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitiy;


/**
 *
 * @author salem_alghanim
 */
public class Course {
    public int courseid;
    public String coursecode;
    public String name;
    public Corrdinator corrdinator;
    public TextBook textbook;

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Corrdinator getCorrdinator() {
        return corrdinator;
    }

    public void setCorrdinator(Corrdinator corrdinator) {
        this.corrdinator = corrdinator;
    }

    public TextBook getTextbook() {
        return textbook;
    }

    public void setTextbook(TextBook textbook) {
        this.textbook = textbook;
    }
    
    
}
