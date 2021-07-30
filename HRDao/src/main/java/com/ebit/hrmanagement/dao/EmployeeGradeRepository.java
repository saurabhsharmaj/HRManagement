package com.ebit.hrmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hrmanagement.model.EmpGrade;

@Repository
public interface EmployeeGradeRepository  extends CrudRepository<EmpGrade, Integer> {

}
