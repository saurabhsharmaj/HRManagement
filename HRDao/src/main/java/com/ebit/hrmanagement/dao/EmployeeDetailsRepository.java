package com.ebit.hrmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hrmanagement.model.EmpDetail;

@Repository
public interface EmployeeDetailsRepository extends CrudRepository<EmpDetail,Integer> {

}
