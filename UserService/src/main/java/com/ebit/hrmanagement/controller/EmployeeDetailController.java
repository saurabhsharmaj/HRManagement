package com.ebit.hrmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.hrmanagement.model.EmpDetail;
//import com.ebit.hrmanagement.model.User;
import com.ebit.hrmanagement.service.EmpDetailService;
import com.ebit.hrmanagement.service.UserService;


@RestController
public class EmployeeDetailController {
	@Autowired
	EmpDetailService empDetailService;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/employee")
	public List<EmpDetail> getAllemployees()
	{
		return empDetailService.getAllEmp();
	}

	@PostMapping("/employee")
	public void addEmp(@RequestBody EmpDetail emp)
	{
		//EmpDetail empDetail = new EmpDetail();
		
//		Optional<User> user = userService.findById(emp.getUserid());
//	System.out.println(user);
//		if(user.isPresent()) {
//			empDetail.setUserid(user.get());
		//}
		//empDetailService.addEmp(empDetail);
		
		empDetailService.addEmp(emp);
	}
}
