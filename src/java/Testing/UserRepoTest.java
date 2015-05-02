/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Entitiy.Corrdinator;
import Entitiy.Course;
import Repository.CourseRepository;
import Repository.UsersRepository;
import java.util.List;

/**
 *
 * @author salem
 */
public class UserRepoTest {
    
    UsersRepository urepo;
     public void main()
     {
         List<Corrdinator> testing;
        
         testing=urepo.getusers();
          for (Corrdinator user : testing) {
            System.out.println("user id" + user.getId());
            System.out.println("user name" + user.getName());
            System.out.println("user Username" + user.getUsername());
            System.out.println("user Password" + user.getPassword());
            System.out.println("user Email " + user.getEmail());
            System.out.println("----------------------------------------------------------------");
            

        }
     }
}
