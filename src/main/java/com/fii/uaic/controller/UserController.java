package com.fii.uaic.controller;

import com.fii.uaic.model.User;
import com.fii.uaic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by sscutaru on 1/25/2017.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all" , method = RequestMethod.GET)
    public Collection<User> getAll(){
        return userService.getAll();
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public User getUserById(@PathVariable("id") int id){
//        return userService.getUserById(id);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deleteUserById(@PathVariable("id") int id){
//        userService.removeUserById(id);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void deleteUserById(@RequestBody User user){
//        userService.updateUser(user);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void insertUser(@RequestBody User user){
//        userService.insertUser(user);
//    }
}
