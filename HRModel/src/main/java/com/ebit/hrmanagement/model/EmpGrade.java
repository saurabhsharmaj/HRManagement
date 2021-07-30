package com.ebit.hrmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class EmpGrade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name = "empid")
	private EmpDetail emp_id;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department dept_id;
	
	@ManyToOne
	@JoinColumn(name = "grade_id")
	private GradePay grde_id;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date emp_from_date;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date emp_to_date;
	public EmpGrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpGrade(int id, EmpDetail emp_id, Department dept_id, GradePay grde_id, Date emp_from_date,
			Date emp_to_date) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.dept_id = dept_id;
		this.grde_id = grde_id;
		this.emp_from_date = emp_from_date;
		this.emp_to_date = emp_to_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmpDetail getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(EmpDetail emp_id) {
		this.emp_id = emp_id;
	}
	public Department getDept_id() {
		return dept_id;
	}
	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}
	public GradePay getGrde_id() {
		return grde_id;
	}
	public void setGrde_id(GradePay grde_id) {
		this.grde_id = grde_id;
	}
	public Date getEmp_from_date() {
		return emp_from_date;
	}
	public void setEmp_from_date(Date emp_from_date) {
		this.emp_from_date = emp_from_date;
	}
	public Date getEmp_to_date() {
		return emp_to_date;
	}
	public void setEmp_to_date(Date emp_to_date) {
		this.emp_to_date = emp_to_date;
	}
	@Override
	public String toString() {
		return "EmpGrade [id=" + id + ", emp_id=" + emp_id + ", dept_id=" + dept_id + ", grde_id=" + grde_id
				+ ", emp_from_date=" + emp_from_date + ", emp_to_date=" + emp_to_date + "]";
	}
}
