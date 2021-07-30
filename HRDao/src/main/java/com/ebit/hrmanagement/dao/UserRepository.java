package com.ebit.hrmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hrmanagement.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> 
{
	
}
