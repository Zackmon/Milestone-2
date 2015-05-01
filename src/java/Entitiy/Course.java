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
    public int corrdinatorID;
    public TextBook textbook;

    public Course(int courseid, String coursecode, String name, int corrdinatorID, TextBook textbook) {
        this.courseid = courseid;
        this.coursecode = coursecode;
        this.name = name;
        this.corrdinatorID = corrdinatorID;
        this.textbook = textbook;
    }
    
    

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

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public int getCorrdinatorID() {
        return corrdinatorID;
    }

    public void setCorrdinatorID(int corrdinatorID) {
        this.corrdinatorID = corrdinatorID;
    }

   

    public TextBook getTextbook() {
        return textbook;
    }

    public void setTextbook(TextBook textbook) {
        this.textbook = textbook;
    }
    
    
}
