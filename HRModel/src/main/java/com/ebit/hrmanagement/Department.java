package com.ebit.hrmanagement;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dpet_id")
	private int dpetId;

	@Column(name="dept_name")
	private String deptName;

	//bi-directional many-to-one association to EmpGrade
	@OneToMany(mappedBy="department")
	private List<EmpGrade> empGrades;

	//bi-directional many-to-one association to EmpSalary
	@OneToMany(mappedBy="department")
	private List<EmpSalary> empSalaries;

	public Department() {
	}

	public int getDpetId() {
		return this.dpetId;
	}

	public void setDpetId(int dpetId) {
		this.dpetId = dpetId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<EmpGrade> getEmpGrades() {
		return this.empGrades;
	}

	public void setEmpGrades(List<EmpGrade> empGrades) {
		this.empGrades = empGrades;
	}

	public EmpGrade addEmpGrade(EmpGrade empGrade) {
		getEmpGrades().add(empGrade);
		empGrade.setDepartment(this);

		return empGrade;
	}

	public EmpGrade removeEmpGrade(EmpGrade empGrade) {
		getEmpGrades().remove(empGrade);
		empGrade.setDepartment(null);

		return empGrade;
	}

	public List<EmpSalary> getEmpSalaries() {
		return this.empSalaries;
	}

	public void setEmpSalaries(List<EmpSalary> empSalaries) {
		this.empSalaries = empSalaries;
	}

	public EmpSalary addEmpSalary(EmpSalary empSalary) {
		getEmpSalaries().add(empSalary);
		empSalary.setDepartment(this);

		return empSalary;
	}

	public EmpSalary removeEmpSalary(EmpSalary empSalary) {
		getEmpSalaries().remove(empSalary);
		empSalary.setDepartment(null);

		return empSalary;
	}

}