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
import javax.ejb.Singleton;

/**
 *
 * @author salem_alghanim
 */
@Singleton

public class CourseRepository {
    private Map <Integer ,Semester> semesters;
    private List<Semester> list_semesters; 
    
    public void insertData () 
    {
        semesters = new HashMap<>();
        list_semesters = new ArrayList <Semester>();
        insertTestingData();
        
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
    
    public List<Course> getCorrdinatorCourses (int sem_id,int cor_id)
    {
        List <Course> cor_courses = new ArrayList<Course>();
        List <Course> all_courses = getCourses(sem_id);
        
        for (Course all_course : all_courses) 
        {
            if(all_course.getCorrdinatorID() == cor_id)
                cor_courses.add(all_course);
        }
        
        return cor_courses;
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
    public void updateCourse (int sem_id,Course course)
    {
       List<Course> list=semesters.get(sem_id).getCourse();
        for (Course list1 : list) {
            if(list1.getCourseid()== course.getCourseid())
                list1=course;
        }
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
    
    public void updateCourseTextBook (int sem_id,int cid,TextBook book)
      {
          Course course =getCourse(sem_id,cid);
          course.setTextbook(book);
          updateCourse(sem_id,course);
      }
    //------------Below are only for testing they are irrlevent to the content of the code-------------------------------------------
    public void insertTestingData(){
        Semester summer = new Semester (0,2015,"Summer",new ArrayList<Course>());
        Semester spring = new Semester (1,2015,"Spring",new ArrayList<Course>());
        Semester fall = new Semester (2,2015,"Fall",new ArrayList<Course>());
        Course c0 = new Course(0,"CMPS 405","Operating Systems",1,null);
        Course c1 = new Course(1,"CMPS 356","Software Devlopment of Entrprise App",1,null);
        Course c2 = new Course(2,"CMPS 411","Software Engineer",2,null);
        Course c3 = new Course(3,"Math 101","Calculus I",2,null);
        summer.getCourse().add(c3);
        spring.getCourse().add(c2);
        spring.getCourse().add(c1);
        fall.getCourse().add(c0);
        list_semesters.add(fall);
        list_semesters.add(spring);
        list_semesters.add(summer);
        semesters.put(summer.getSemesterid(),summer);
        semesters.put(spring.getSemesterid(),spring);
        semesters.put(fall.getSemesterid(),fall);
        
        
        
        
    }
    
  }

