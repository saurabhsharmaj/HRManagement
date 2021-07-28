package com.ebit.hrmanagement;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping
	public ResponseEntity<User> users(){
		return ResponseEntity.ok(new User());
	}
}
