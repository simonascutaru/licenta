package com.fii.uaic.service;

import com.fii.uaic.model.User;
import com.fii.uaic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sscutaru on 1/25/2017.
 */
@Service
@Transactional
public class UserService {

//    @Qualifier("postgresql")
    @Autowired
    private UserRepository userRepository;

//    public Collection<User> getAllUsers(){
//        return this.userRepository.getAllUsers();
//    }
//
//    public User getUserById(int id){
//        return this.userRepository.getUserById(id);
//    }
//
//
//    public void removeUserById(int id) {
//        this.userRepository.removeUserById(id);
//    }
//
//    public void updateUser(User user){
//        this.userRepository.updateUser(user);
//    }
//
//    public void insertUser(User user) {
//        this.userRepository.insertUserToDb(user);
//    }

    public User save(User usr){
        userRepository.save(usr);
        return usr;
    }

    public List<User> getAll() {
        ArrayList<User> users =  (ArrayList<User>) userRepository.findAll();
        return users;
    }
}
