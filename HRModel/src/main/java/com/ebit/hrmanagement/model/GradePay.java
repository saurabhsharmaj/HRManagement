package com.ebit.hrmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GradePay {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int grade_id;
	private String grade_name;
	private String grade_short_name;
	private Double grade_basic;
	private Double grade_ta;
	private Double grade_da;
	private Double grade_hra;
	private Double grade_ma;
	private Double grade_bonus;
	private Double grade_pf;
	private Double grade_pt;
	
	public GradePay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradePay(int grade_id, String grade_name, String grade_short_name, Double grade_basic, Double grade_ta,
			Double grade_da, Double grade_hra, Double grade_ma, Double grade_bonus, Double grade_pf, Double grade_pt) {
		super();
		this.grade_id = grade_id;
		this.grade_name = grade_name;
		this.grade_short_name = grade_short_name;
		this.grade_basic = grade_basic;
		this.grade_ta = grade_ta;
		this.grade_da = grade_da;
		this.grade_hra = grade_hra;
		this.grade_ma = grade_ma;
		this.grade_bonus = grade_bonus;
		this.grade_pf = grade_pf;
		this.grade_pt = grade_pt;
	}

	public int getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}

	public String getGrade_name() {
		return grade_name;
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}

	public String getGrade_short_name() {
		return grade_short_name;
	}

	public void setGrade_short_name(String grade_short_name) {
		this.grade_short_name = grade_short_name;
	}

	public Double getGrade_basic() {
		return grade_basic;
	}

	public void setGrade_basic(Double grade_basic) {
		this.grade_basic = grade_basic;
	}

	public Double getGrade_ta() {
		return grade_ta;
	}

	public void setGrade_ta(Double grade_ta) {
		this.grade_ta = grade_ta;
	}

	public Double getGrade_da() {
		return grade_da;
	}

	public void setGrade_da(Double grade_da) {
		this.grade_da = grade_da;
	}

	public Double getGrade_hra() {
		return grade_hra;
	}

	public void setGrade_hra(Double grade_hra) {
		this.grade_hra = grade_hra;
	}

	public Double getGrade_ma() {
		return grade_ma;
	}

	public void setGrade_ma(Double grade_ma) {
		this.grade_ma = grade_ma;
	}

	public Double getGrade_bonus() {
		return grade_bonus;
	}

	public void setGrade_bonus(Double grade_bonus) {
		this.grade_bonus = grade_bonus;
	}

	public Double getGrade_pf() {
		return grade_pf;
	}

	public void setGrade_pf(Double grade_pf) {
		this.grade_pf = grade_pf;
	}

	public Double getGrade_pt() {
		return grade_pt;
	}

	public void setGrade_pt(Double grade_pt) {
		this.grade_pt = grade_pt;
	}

	@Override
	public String toString() {
		return "GradePay [grade_id=" + grade_id + ", grade_name=" + grade_name + ", grade_short_name="
				+ grade_short_name + ", grade_basic=" + grade_basic + ", grade_ta=" + grade_ta + ", grade_da="
				+ grade_da + ", grade_hra=" + grade_hra + ", grade_ma=" + grade_ma + ", grade_bonus=" + grade_bonus
				+ ", grade_pf=" + grade_pf + ", grade_pt=" + grade_pt + "]";
	}
	
	
	
}
