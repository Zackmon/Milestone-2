/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;
import Entitiy.Corrdinator;
import com.google.gson.Gson;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import javax.ejb.Singleton;
/**
 *
 * @author salem_alghanim
 */
@Singleton
public class UsersRepository {
    private List<Corrdinator> users =null;
    Corrdinator[] userArray;
    private int lastuserId = 0;
    private final String userUrl = "http://sa1204827.github.io/user.json";

    public List<Corrdinator> getusers ()
        {
            if (users != null) 
            {
                return users;
            }
            else 
            {
                InsertUsersData();
                return users;
            }
        }

    public Corrdinator getUser(int id) {
        return users.stream().filter(c -> c.getId() == id).findFirst().get();
    }
    
    public Corrdinator getUser(String Username, String Password) {
        
       System.out.println("before the if statment");
        if (users == null) {
            System.out.println("I entered the if statment");
            InsertUsersData();
            System.out.println("I Finished the if statment");
        }
         try
        {
        for (int i=0;i<userArray.length;i++)
        {
            
            if(Username.equalsIgnoreCase(userArray[i].getUsername()))
                if(Password.equals(userArray[i].getPassword()))
                {
                    
                    return userArray[i];       
                }
        }
        return null;
    }
        catch (NullPointerException | NoSuchElementException e) {
            return null;
        }
    }
    private void InsertUsersData() {
        if (users != null && users.size() > 0) {
            return;
        }

        Gson gson = new Gson();
        String userStr = Utils.readUrl(userUrl);
        System.out.println(userStr);

        userArray = gson.fromJson(userStr, Corrdinator[].class);
        //Convert the array to a editable list 
        users = new ArrayList<>(Arrays.asList(userArray));
       
        
    }

}
