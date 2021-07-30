package com.ebit.hrmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hrmanagement.dao.UserRepository;
import com.ebit.hrmanagement.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public void addUser(User user) {
		
		repo.save(user);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> user = new ArrayList<>();
		repo.findAll().forEach(user::add);
		return user;
	}

	public Optional<User> findById(Integer userid) {
		return repo.findById(userid);
	}

}
