package com.todoapplication.repository;

import com.todoapplication.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, String> {

    public UserLogin findByUserId(Integer usedId);

}


