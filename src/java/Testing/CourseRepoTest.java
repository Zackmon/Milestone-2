/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Entitiy.Course;
import Entitiy.Semester;
import Repository.CourseRepository;
import java.util.List;

/**
 *
 * @author salem
 */
public class CourseRepoTest {
    
    CourseRepository crepo;
    public void main()
    {
        List<Semester> list_semesters = crepo.getSemester();
        for (Semester list_semester : list_semesters) {
                 System.out.println("Semseter ID " +list_semester.getSemesterid());
                 System.out.println("Semseter year " +list_semester.getYear());
                 System.out.println("Semseter term " +list_semester.getTerm());
                 System.out.println("courses in this semester");
                 List<Course> temp = list_semester.getCourse();
                 for (Course temp1 : temp) {
                 System.out.println("Course ID " +temp1.getCourseid());
                 System.out.println("Course Code " +temp1.getCoursecode());
                 System.out.println("Course name " +temp1.getName());
                 System.out.println("Course Cordinator ID " +temp1.getCorrdinatorID());

             }
             }
    }
}
