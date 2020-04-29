package com.todoapplication.controller;

import com.todoapplication.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    UserRegistrationService userRegistrationService;


    @RequestMapping("/registerUser")
    @ResponseBody
    public String registerUser(String user_name, String email, String phone, String address, String city, Integer zip, String state, String country) {
        String message = userRegistrationService.userRegistration(user_name, email, Integer.parseInt(phone), address, city, zip, state, country);
        return message;
    }
}
