package com.learning.LibraryManagementSystem.Service;

import com.learning.LibraryManagementSystem.Entity.User;
import com.learning.LibraryManagementSystem.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public List<User> findAll(){
        return userRepo.findAll();
    }
    public User saveUser(User user){
        return userRepo.save(user);
    }
 //   public void deleteUser

}
