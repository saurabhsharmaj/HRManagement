package com.ebit.hrmanagement;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the emp_grade database table.
 * 
 */
@Entity
@Table(name="emp_grade")
@NamedQuery(name="EmpGrade.findAll", query="SELECT e FROM EmpGrade e")
public class EmpGrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_from_date")
	private Date empFromDate;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_to_date")
	private Date empToDate;

	//bi-directional many-to-one association to EmpDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="emp_id")
	private EmpDetail empDetail;

	//bi-directional many-to-one association to Department
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dept_id")
	private Department department;

	//bi-directional many-to-one association to GradePay
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="grade_id")
	private GradePay gradePay;

	//bi-directional many-to-one association to EmpSalary
	@OneToMany(mappedBy="empGrade")
	private List<EmpSalary> empSalaries;

	public EmpGrade() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEmpFromDate() {
		return this.empFromDate;
	}

	public void setEmpFromDate(Date empFromDate) {
		this.empFromDate = empFromDate;
	}

	public Date getEmpToDate() {
		return this.empToDate;
	}

	public void setEmpToDate(Date empToDate) {
		this.empToDate = empToDate;
	}

	public EmpDetail getEmpDetail() {
		return this.empDetail;
	}

	public void setEmpDetail(EmpDetail empDetail) {
		this.empDetail = empDetail;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public GradePay getGradePay() {
		return this.gradePay;
	}

	public void setGradePay(GradePay gradePay) {
		this.gradePay = gradePay;
	}

	public List<EmpSalary> getEmpSalaries() {
		return this.empSalaries;
	}

	public void setEmpSalaries(List<EmpSalary> empSalaries) {
		this.empSalaries = empSalaries;
	}

	public EmpSalary addEmpSalary(EmpSalary empSalary) {
		getEmpSalaries().add(empSalary);
		empSalary.setEmpGrade(this);

		return empSalary;
	}

	public EmpSalary removeEmpSalary(EmpSalary empSalary) {
		getEmpSalaries().remove(empSalary);
		empSalary.setEmpGrade(null);

		return empSalary;
	}

}