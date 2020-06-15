package com.todoapplication.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todoapplication.model.UserLogin;
import com.todoapplication.service.UserLoginService;


@RestController
public class LoginController {
	@Autowired
	UserLoginService userLoginService;

	@GetMapping(value = "/hello")
	@ResponseBody
	public String welcomePage() {
		return "Welcome Page";
	}

	@RequestMapping("/userLoginDetails")
	@ResponseBody

	public UserLogin getLoginDetail(@RequestParam(value = "user_id") Integer userId) {
		System.out.println(userId);
		UserLogin byUserId = userLoginService.fetchLoginDetail(userId);
		System.out.println(byUserId.getPassword());
		return byUserId;
	}

	@GetMapping("/profile")
	@PreAuthorize("hasAuthority('SCOPE_profile')")
	public ModelAndView userDetails(OAuth2AuthenticationToken authentication) {
		return new ModelAndView("userProfile",
				Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
	}

}
