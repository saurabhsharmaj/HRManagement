package com.ebit.hrmanagement.vo;

import java.sql.Blob;
import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.ebit.hrmanagement.model.User;


public class EmpDetailVO {
	
	private int empid;
	
	
	private Integer userid;
	
	
	private String emptitle;
	
	
	private String empname;
	
	
	private Date empdob;
	
	
	private Date empdoj;
	
	
	private String empaddress;
	
	
	private String empcity;
	
	
	private String emppincode;
	
	
	private String emp_mobile_no;
	
	private String emp_state;
	
	private String emp_mail_id;
	
	private String emp_pan_no;
	@JsonIgnore
	private Blob emp_pancard;

	public EmpDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDetailVO(int empid, Integer userid, String emptitle,
			@NotNull(message = "Emp_name cannot be null") String empname, Date empdob, Date empdoj, String empaddress,
			String empcity, @NotNull(message = "Pincode cannot be null") String emppincode,
			@NotNull(message = "Emp mobile number cannot be null") String emp_mobile_no, String emp_state,
			@Email(message = "email should be valid") String emp_mail_id, @NotNull(message = "") String emp_pan_no,
			Blob emp_pancard) {
		super();
		this.empid = empid;
		this.userid = userid;
		this.emptitle = emptitle;
		this.empname = empname;
		this.empdob = empdob;
		this.empdoj = empdoj;
		this.empaddress = empaddress;
		this.empcity = empcity;
		this.emppincode = emppincode;
		this.emp_mobile_no = emp_mobile_no;
		this.emp_state = emp_state;
		this.emp_mail_id = emp_mail_id;
		this.emp_pan_no = emp_pan_no;
		this.emp_pancard = emp_pancard;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEmptitle() {
		return emptitle;
	}

	public void setEmptitle(String emptitle) {
		this.emptitle = emptitle;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Date getEmpdob() {
		return empdob;
	}

	public void setEmpdob(Date empdob) {
		this.empdob = empdob;
	}

	public Date getEmpdoj() {
		return empdoj;
	}

	public void setEmpdoj(Date empdoj) {
		this.empdoj = empdoj;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	public String getEmppincode() {
		return emppincode;
	}

	public void setEmppincode(String emppincode) {
		this.emppincode = emppincode;
	}

	public String getEmp_mobile_no() {
		return emp_mobile_no;
	}

	public void setEmp_mobile_no(String emp_mobile_no) {
		this.emp_mobile_no = emp_mobile_no;
	}

	public String getEmp_state() {
		return emp_state;
	}

	public void setEmp_state(String emp_state) {
		this.emp_state = emp_state;
	}

	public String getEmp_mail_id() {
		return emp_mail_id;
	}

	public void setEmp_mail_id(String emp_mail_id) {
		this.emp_mail_id = emp_mail_id;
	}

	public String getEmp_pan_no() {
		return emp_pan_no;
	}

	public void setEmp_pan_no(String emp_pan_no) {
		this.emp_pan_no = emp_pan_no;
	}

	public Blob getEmp_pancard() {
		return emp_pancard;
	}

	public void setEmp_pancard(Blob emp_pancard) {
		this.emp_pancard = emp_pancard;
	}

	@Override
	public String toString() {
		return "EmpDetail [empid=" + empid + ", userid=" + userid + ", emptitle=" + emptitle + ", empname=" + empname
				+ ", empdob=" + empdob + ", empdoj=" + empdoj + ", empaddress=" + empaddress + ", empcity=" + empcity
				+ ", emppincode=" + emppincode + ", emp_mobile_no=" + emp_mobile_no + ", emp_state=" + emp_state
				+ ", emp_mail_id=" + emp_mail_id + ", emp_pan_no=" + emp_pan_no + ", emp_pancard=" + emp_pancard + "]";
	}
	
	
	
}
