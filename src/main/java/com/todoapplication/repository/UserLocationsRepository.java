package com.todoapplication.repository;

import com.todoapplication.model.UserLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLocationsRepository extends JpaRepository<UserLocations, String> {

    public UserLocations findById(Integer id);


}


