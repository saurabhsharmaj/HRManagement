package com.ebit.hrmanagement;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_info database table.
 * 
 */
@Entity
@Table(name="user_info")
@NamedQuery(name="UserInfo.findAll", query="SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private int userId;

	@Column(name="EMAIL_ID")
	private String emailId;

	private String password;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_TYPE")
	private String userType;

	//bi-directional many-to-one association to EmpDetail
	@OneToMany(mappedBy="userInfo")
	private List<EmpDetail> empDetails;

	public UserInfo() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List<EmpDetail> getEmpDetails() {
		return this.empDetails;
	}

	public void setEmpDetails(List<EmpDetail> empDetails) {
		this.empDetails = empDetails;
	}

	public EmpDetail addEmpDetail(EmpDetail empDetail) {
		getEmpDetails().add(empDetail);
		empDetail.setUserInfo(this);

		return empDetail;
	}

	public EmpDetail removeEmpDetail(EmpDetail empDetail) {
		getEmpDetails().remove(empDetail);
		empDetail.setUserInfo(null);

		return empDetail;
	}

}