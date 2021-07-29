package com.ebit.hrmanagement;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the emp_salary database table.
 * 
 */
@Entity
@Table(name="emp_salary")
@NamedQuery(name="EmpSalary.findAll", query="SELECT e FROM EmpSalary e")
public class EmpSalary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="salary_id")
	private int salaryId;

	@Column(name="emp_basic")
	private double empBasic;

	@Column(name="emp_bonus")
	private double empBonus;

	@Column(name="emp_da")
	private double empDa;

	@Column(name="emp_gross")
	private double empGross;

	@Column(name="emp_hra")
	private double empHra;

	@Column(name="emp_ma")
	private double empMa;

	@Column(name="emp_pf")
	private double empPf;

	@Column(name="emp_pt")
	private double empPt;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_salary_eimbursment_date")
	private Date empSalaryEimbursmentDate;

	@Column(name="emp_salary_month")
	private String empSalaryMonth;

	@Column(name="emp_salary_year")
	private String empSalaryYear;

	@Column(name="emp_ta")
	private double empTa;

	@Column(name="emp_total_salary")
	private double empTotalSalary;

	//bi-directional many-to-one association to Department
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dept_id")
	private Department department;

	//bi-directional many-to-one association to EmpDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="emp_id")
	private EmpDetail empDetail;

	//bi-directional many-to-one association to EmpGrade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="grade_id")
	private EmpGrade empGrade;

	public EmpSalary() {
	}

	public int getSalaryId() {
		return this.salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public double getEmpBasic() {
		return this.empBasic;
	}

	public void setEmpBasic(double empBasic) {
		this.empBasic = empBasic;
	}

	public double getEmpBonus() {
		return this.empBonus;
	}

	public void setEmpBonus(double empBonus) {
		this.empBonus = empBonus;
	}

	public double getEmpDa() {
		return this.empDa;
	}

	public void setEmpDa(double empDa) {
		this.empDa = empDa;
	}

	public double getEmpGross() {
		return this.empGross;
	}

	public void setEmpGross(double empGross) {
		this.empGross = empGross;
	}

	public double getEmpHra() {
		return this.empHra;
	}

	public void setEmpHra(double empHra) {
		this.empHra = empHra;
	}

	public double getEmpMa() {
		return this.empMa;
	}

	public void setEmpMa(double empMa) {
		this.empMa = empMa;
	}

	public double getEmpPf() {
		return this.empPf;
	}

	public void setEmpPf(double empPf) {
		this.empPf = empPf;
	}

	public double getEmpPt() {
		return this.empPt;
	}

	public void setEmpPt(double empPt) {
		this.empPt = empPt;
	}

	public Date getEmpSalaryEimbursmentDate() {
		return this.empSalaryEimbursmentDate;
	}

	public void setEmpSalaryEimbursmentDate(Date empSalaryEimbursmentDate) {
		this.empSalaryEimbursmentDate = empSalaryEimbursmentDate;
	}

	public String getEmpSalaryMonth() {
		return this.empSalaryMonth;
	}

	public void setEmpSalaryMonth(String empSalaryMonth) {
		this.empSalaryMonth = empSalaryMonth;
	}

	public String getEmpSalaryYear() {
		return this.empSalaryYear;
	}

	public void setEmpSalaryYear(String empSalaryYear) {
		this.empSalaryYear = empSalaryYear;
	}

	public double getEmpTa() {
		return this.empTa;
	}

	public void setEmpTa(double empTa) {
		this.empTa = empTa;
	}

	public double getEmpTotalSalary() {
		return this.empTotalSalary;
	}

	public void setEmpTotalSalary(double empTotalSalary) {
		this.empTotalSalary = empTotalSalary;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public EmpDetail getEmpDetail() {
		return this.empDetail;
	}

	public void setEmpDetail(EmpDetail empDetail) {
		this.empDetail = empDetail;
	}

	public EmpGrade getEmpGrade() {
		return this.empGrade;
	}

	public void setEmpGrade(EmpGrade empGrade) {
		this.empGrade = empGrade;
	}

}