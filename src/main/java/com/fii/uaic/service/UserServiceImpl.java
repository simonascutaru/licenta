package com.fii.uaic.service;

import com.fii.uaic.model.User;
import com.fii.uaic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sscutaru on 5/19/2017.
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User usr) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
