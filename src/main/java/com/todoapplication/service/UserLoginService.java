package com.todoapplication.service;

import com.todoapplication.model.UserLogin;

public interface UserLoginService {
    public UserLogin fetchLoginDetail(Integer userId);
}
