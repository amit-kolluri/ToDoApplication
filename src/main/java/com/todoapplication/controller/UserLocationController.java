package com.todoapplication.controller;

import com.todoapplication.model.LocationsDomain;
import com.todoapplication.model.UserDetails;
import com.todoapplication.model.UserLocations;
import com.todoapplication.model.UserLogin;
import com.todoapplication.repository.UserLocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class UserLocationController {

    @Autowired
    UserLocationsRepository userLocationsRepository;


    @RequestMapping("/locationids")
    @ResponseBody
    public UserLocations fetchLocations(@RequestParam(value = "user_id")Integer id) {
        System.out.println("idz before call : "+id);
        return userLocationsRepository.findById(id);
    }

    @RequestMapping(value = "/registerlocations", method = RequestMethod.POST)
    @ResponseBody
    public String registerUserLocations(@RequestBody LocationsDomain locations){

        System.out.println("locations IDS before call : "+locations.getId());
        System.out.println("locations before call : "+locations.getLocations());
        UserLocations userLocations  = new UserLocations();
        userLocations.setId(locations.getId());
        int[] numbers = Arrays.asList(locations.getLocations().split(","))
                .stream()
                .map(String::trim)
                .mapToInt(Integer::parseInt).toArray();
        userLocations.setLocation_ids(numbers);

        userLocationsRepository.save(userLocations);

        return "Success";
    }
}
