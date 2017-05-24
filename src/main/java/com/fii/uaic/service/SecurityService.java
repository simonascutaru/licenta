package com.fii.uaic.service;

/**
 * Created by sscutaru on 5/24/2017.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String userName, String userPassword);
}
