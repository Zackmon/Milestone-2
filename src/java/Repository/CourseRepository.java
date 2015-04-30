/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entitiy.Course;
import Entitiy.Semester;
import Entitiy.TextBook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author salem_alghanim
 */
public class CourseRepository {
    private Map <Integer ,Semester> semesters;
    private List<Semester> list_semesters; 
    
    public void insertData () 
    {
        semesters = new HashMap<>();
        list_semesters = new ArrayList <Semester>();
    }

    public List<Semester> getSemester()
    {   if(list_semesters==null)
        insertData();
        
        return list_semesters;
        
    }
    public List<Course> getCourses(int sem_id)
    {
        List<Course> courses;
        courses = semesters.get(sem_id).getCourse();
        return courses;
    }
    
    public Course getCourse (int sem_id,int cid)
    {
        List<Course> courses;
        courses = semesters.get(sem_id).getCourse();
        
        for (Course course : courses) {
            if (course.getCourseid() == cid)
                return course;
        }
        return null;
    }
    
    public TextBook getCourseTextBook (int sem_id,int cid)
    {
        TextBook nullfied = new TextBook("Not Assigned");
        Course course =getCourse(sem_id,cid);
        if (course.getTextbook() == null)
        {
            return nullfied;
        }
        else 
        {
            return course.getTextbook();
        }
    }
  }

