package com.todoapplication.service;

public interface UserRegistrationService {

    String userRegistration(String user_name, String email, Integer phone, String address, String city, Integer zip, String state, String country);
}
