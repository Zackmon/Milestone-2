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
public class Semester {
    public int semesterid;
    public int year;
    public String term;
    public List<Course> course;

    public Semester(int semesterid, int year, String term, List<Course> course) {
        this.semesterid = semesterid;
        this.year = year;
        this.term = term;
        this.course = course;
    }

   
    public int getSemesterid() {
        return semesterid;
    }

    public void setSemesterid(int semesterid) {
        this.semesterid = semesterid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
    
}
