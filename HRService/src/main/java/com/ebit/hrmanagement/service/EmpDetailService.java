package com.ebit.hrmanagement.service;



import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hrmanagement.dao.EmployeeDetailsRepository;
import com.ebit.hrmanagement.model.EmpDetail;

@Service
public class EmpDetailService 
{
	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;

	public List<EmpDetail> getAllEmp() {
		List<EmpDetail> emp = new ArrayList<>();
		employeeDetailsRepository.findAll().forEach(emp::add);
		return emp;
	}

	public void addEmp(EmpDetail emp) {
		// TODO Auto-generated method stub
		employeeDetailsRepository.save(emp);
	}

}
