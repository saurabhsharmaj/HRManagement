package com.ebit.hrmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hrmanagement.model.GradePay;

@Repository
public interface GradePayRepository extends CrudRepository<GradePay, Integer>{

}
