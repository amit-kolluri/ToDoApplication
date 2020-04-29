package com.todoapplication.controller;

import com.todoapplication.model.UserLogin;
import com.todoapplication.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserLoginService userLoginService;

    @GetMapping(value = "/hello")
    @ResponseBody
    public String welcomePage() {
        return "Welcosme Page";
    }

    @RequestMapping("/userLoginDetails")
    @ResponseBody
    public UserLogin getLoginDetail(Integer userId) {
        System.out.println(userId);
        UserLogin byUserId = userLoginService.fetchLoginDetail(userId);
        System.out.println(byUserId.getPassword());
        return byUserId;
    }


}

