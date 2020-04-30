package com.todoapplication.repository;

import com.todoapplication.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserDetails, Long> {

    //  public String saveAll(String user_name, String email, String phone, String address, String city, String zip, String state, String country);

}
