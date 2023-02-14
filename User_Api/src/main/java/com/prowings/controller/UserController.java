package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.User;
import com.prowings.service.UserService;

@RestController
@RequestMapping("/ur")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
		
	}
}
