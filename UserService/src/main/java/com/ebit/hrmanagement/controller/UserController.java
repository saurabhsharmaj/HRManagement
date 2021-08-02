package com.ebit.hrmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.hrmanagement.model.User;
import com.ebit.hrmanagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
}
