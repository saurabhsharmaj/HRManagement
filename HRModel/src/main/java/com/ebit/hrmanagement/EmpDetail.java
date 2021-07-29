package com.ebit.hrmanagement;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the emp_detail database table.
 * 
 */
@Entity
@Table(name="emp_detail")
@NamedQuery(name="EmpDetail.findAll", query="SELECT e FROM EmpDetail e")
public class EmpDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_id")
	private int empId;

	@Column(name="emp_address")
	private String empAddress;

	@Column(name="emp_city")
	private String empCity;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_dob")
	private Date empDob;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_doj")
	private Date empDoj;

	@Column(name="emp_mail_id")
	private String empMailId;

	@Column(name="emp_mobile_no")
	private String empMobileNo;

	@Column(name="emp_name")
	private String empName;

	@Column(name="emp_pan_no")
	private String empPanNo;

	@Lob
	@Column(name="emp_pancard")
	private byte[] empPancard;

	@Column(name="emp_pincode")
	private String empPincode;

	@Column(name="emp_state")
	private String empState;

	@Column(name="emp_title")
	private String empTitle;

	//bi-directional many-to-one association to UserInfo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserInfo userInfo;

	//bi-directional many-to-one association to EmpGrade
	@OneToMany(mappedBy="empDetail")
	private List<EmpGrade> empGrades;

	//bi-directional many-to-one association to EmpSalary
	@OneToMany(mappedBy="empDetail")
	private List<EmpSalary> empSalaries;

	public EmpDetail() {
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpCity() {
		return this.empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Date getEmpDob() {
		return this.empDob;
	}

	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	public Date getEmpDoj() {
		return this.empDoj;
	}

	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}

	public String getEmpMailId() {
		return this.empMailId;
	}

	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}

	public String getEmpMobileNo() {
		return this.empMobileNo;
	}

	public void setEmpMobileNo(String empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPanNo() {
		return this.empPanNo;
	}

	public void setEmpPanNo(String empPanNo) {
		this.empPanNo = empPanNo;
	}

	public byte[] getEmpPancard() {
		return this.empPancard;
	}

	public void setEmpPancard(byte[] empPancard) {
		this.empPancard = empPancard;
	}

	public String getEmpPincode() {
		return this.empPincode;
	}

	public void setEmpPincode(String empPincode) {
		this.empPincode = empPincode;
	}

	public String getEmpState() {
		return this.empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public String getEmpTitle() {
		return this.empTitle;
	}

	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List<EmpGrade> getEmpGrades() {
		return this.empGrades;
	}

	public void setEmpGrades(List<EmpGrade> empGrades) {
		this.empGrades = empGrades;
	}

	public EmpGrade addEmpGrade(EmpGrade empGrade) {
		getEmpGrades().add(empGrade);
		empGrade.setEmpDetail(this);

		return empGrade;
	}

	public EmpGrade removeEmpGrade(EmpGrade empGrade) {
		getEmpGrades().remove(empGrade);
		empGrade.setEmpDetail(null);

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
		empSalary.setEmpDetail(this);

		return empSalary;
	}

	public EmpSalary removeEmpSalary(EmpSalary empSalary) {
		getEmpSalaries().remove(empSalary);
		empSalary.setEmpDetail(null);

		return empSalary;
	}

}