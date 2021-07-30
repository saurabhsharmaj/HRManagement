package com.ebit.hrmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hrmanagement.model.EmpSalary;

@Repository
public interface EmployeeSalaryRepository extends CrudRepository<EmpSalary,Integer>{

}
