package com.ebit.hrmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmpSalary {

	@Id
	private int salary_id;
	@ManyToOne
	@JoinColumn(name = "empid")
	private EmpDetail emp_id;
	private String emp_salary_month;
	private String emp_salary_year;
	private Date eimbursment_date;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department dept_id;
	@ManyToOne
	@JoinColumn(name = "grade_id")	
	private GradePay grade_id;
	
	private Double emp_basic;
	private Double emp_ta;
	private Double emp_da;
	private Double emp_hra;
	private Double emp_ma;
	private Double emp_bonus;
	private Double emp_pf;
	private Double emp_pt;
	private Double emp_gross;
	private Double emp_totoal_salary;
	
	public EmpSalary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpSalary(int salary_id, EmpDetail emp_id, String emp_salary_month, String emp_salary_year,
			Date eimbursment_date, Department dept_id, GradePay grade_id, Double emp_basic, Double emp_ta,
			Double emp_da, Double emp_hra, Double emp_ma, Double emp_bonus, Double emp_pf, Double emp_pt,
			Double emp_gross, Double emp_totoal_salary) {
		super();
		this.salary_id = salary_id;
		this.emp_id = emp_id;
		this.emp_salary_month = emp_salary_month;
		this.emp_salary_year = emp_salary_year;
		this.eimbursment_date = eimbursment_date;
		this.dept_id = dept_id;
		this.grade_id = grade_id;
		this.emp_basic = emp_basic;
		this.emp_ta = emp_ta;
		this.emp_da = emp_da;
		this.emp_hra = emp_hra;
		this.emp_ma = emp_ma;
		this.emp_bonus = emp_bonus;
		this.emp_pf = emp_pf;
		this.emp_pt = emp_pt;
		this.emp_gross = emp_gross;
		this.emp_totoal_salary = emp_totoal_salary;
	}

	public int getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}

	public EmpDetail getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(EmpDetail emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_salary_month() {
		return emp_salary_month;
	}

	public void setEmp_salary_month(String emp_salary_month) {
		this.emp_salary_month = emp_salary_month;
	}

	public String getEmp_salary_year() {
		return emp_salary_year;
	}

	public void setEmp_salary_year(String emp_salary_year) {
		this.emp_salary_year = emp_salary_year;
	}

	public Date getEimbursment_date() {
		return eimbursment_date;
	}

	public void setEimbursment_date(Date eimbursment_date) {
		this.eimbursment_date = eimbursment_date;
	}

	public Department getDept_id() {
		return dept_id;
	}

	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}

	public GradePay getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(GradePay grade_id) {
		this.grade_id = grade_id;
	}

	public Double getEmp_basic() {
		return emp_basic;
	}

	public void setEmp_basic(Double emp_basic) {
		this.emp_basic = emp_basic;
	}

	public Double getEmp_ta() {
		return emp_ta;
	}

	public void setEmp_ta(Double emp_ta) {
		this.emp_ta = emp_ta;
	}

	public Double getEmp_da() {
		return emp_da;
	}

	public void setEmp_da(Double emp_da) {
		this.emp_da = emp_da;
	}

	public Double getEmp_hra() {
		return emp_hra;
	}

	public void setEmp_hra(Double emp_hra) {
		this.emp_hra = emp_hra;
	}

	public Double getEmp_ma() {
		return emp_ma;
	}

	public void setEmp_ma(Double emp_ma) {
		this.emp_ma = emp_ma;
	}

	public Double getEmp_bonus() {
		return emp_bonus;
	}

	public void setEmp_bonus(Double emp_bonus) {
		this.emp_bonus = emp_bonus;
	}

	public Double getEmp_pf() {
		return emp_pf;
	}

	public void setEmp_pf(Double emp_pf) {
		this.emp_pf = emp_pf;
	}

	public Double getEmp_pt() {
		return emp_pt;
	}

	public void setEmp_pt(Double emp_pt) {
		this.emp_pt = emp_pt;
	}

	public Double getEmp_gross() {
		return emp_gross;
	}

	public void setEmp_gross(Double emp_gross) {
		this.emp_gross = emp_gross;
	}

	public Double getEmp_totoal_salary() {
		return emp_totoal_salary;
	}

	public void setEmp_totoal_salary(Double emp_totoal_salary) {
		this.emp_totoal_salary = emp_totoal_salary;
	}

	@Override
	public String toString() {
		return "EmpSalary [salary_id=" + salary_id + ", emp_id=" + emp_id + ", emp_salary_month=" + emp_salary_month
				+ ", emp_salary_year=" + emp_salary_year + ", eimbursment_date=" + eimbursment_date + ", dept_id="
				+ dept_id + ", grade_id=" + grade_id + ", emp_basic=" + emp_basic + ", emp_ta=" + emp_ta + ", emp_da="
				+ emp_da + ", emp_hra=" + emp_hra + ", emp_ma=" + emp_ma + ", emp_bonus=" + emp_bonus + ", emp_pf="
				+ emp_pf + ", emp_pt=" + emp_pt + ", emp_gross=" + emp_gross + ", emp_totoal_salary="
				+ emp_totoal_salary + "]";
	}
	
}
