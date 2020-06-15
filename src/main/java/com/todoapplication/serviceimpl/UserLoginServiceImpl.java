package com.todoapplication.serviceimpl;

import com.todoapplication.model.UserLogin;
import com.todoapplication.repository.UserLoginRepository;
import com.todoapplication.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    UserLoginRepository userLoginRepository;

    public UserLogin fetchLoginDetail(Integer userName) {
        return userLoginRepository.findByUserId(userName);
    }
}
