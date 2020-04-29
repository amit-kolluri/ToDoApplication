package com.todoapplication.serviceimpl;

import com.todoapplication.model.UserDetails;
import com.todoapplication.repository.UserRegistrationRepository;
import com.todoapplication.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    UserRegistrationRepository userRegistrationRepository;

    @Override
    public String userRegistration(String user_name, String email, Integer phone, String address, String city, Integer zip, String state, String country) {
        UserDetails userDetails = new UserDetails();
        userDetails.setUser_name(user_name);
        userDetails.setEmail(email);
        userDetails.setPhone(phone);

        userRegistrationRepository.save(userDetails);

        return "success";
    }
}
