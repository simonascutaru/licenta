package com.fii.uaic.service;

import com.fii.uaic.model.User;
import com.fii.uaic.repository.RoleRepository;
import com.fii.uaic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sscutaru on 5/19/2017.
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void save(User usr) {
        usr.setUserPassword(bCryptPasswordEncoder.encode(usr.getUserPassword()));
        usr.setRole(usr.getRole());
        userRepository.save(usr);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User findByUsername(String userName) {
        return userRepository.findByUsername(userName);
    }
}
