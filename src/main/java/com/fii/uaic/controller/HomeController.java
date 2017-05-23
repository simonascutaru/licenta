package com.fii.uaic.controller;

import com.fii.uaic.model.User;
import com.fii.uaic.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sscutaru on 1/25/2017.
 */

@RestController
public class HomeController {

    @Autowired
    private UserService usr;
//
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
//    public String hello(HttpServletRequest request) {
//
//        return "homepage";
//    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request, Model model) {

        return "homepage";
    }


//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index(Principal principal) {
//        return principal != null ? "homeSignedIn" : "homeNotSignedIn";
//    }

    @RequestMapping(value = "/")
    public String index(){
        return "seufhae";
    }

    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";

        for(User user : usr.getAll()){
            result += "<div>" + user.toString() + "</div>";
        }

        return result + "</html>";
    }

}
