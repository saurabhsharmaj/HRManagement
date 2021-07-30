package com.ebit.hrmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hrmanagement.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
