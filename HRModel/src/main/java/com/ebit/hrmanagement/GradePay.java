package com.ebit.hrmanagement;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grade_pay database table.
 * 
 */
@Entity
@Table(name="grade_pay")
@NamedQuery(name="GradePay.findAll", query="SELECT g FROM GradePay g")
public class GradePay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="grade_id")
	private int gradeId;

	@Column(name="grade_basic")
	private double gradeBasic;

	@Column(name="grade_bonus")
	private double gradeBonus;

	@Column(name="grade_da")
	private double gradeDa;

	@Column(name="grade_hra")
	private double gradeHra;

	@Column(name="grade_ma")
	private double gradeMa;

	@Column(name="grade_name")
	private String gradeName;

	@Column(name="grade_pf")
	private double gradePf;

	@Column(name="grade_pt")
	private double gradePt;

	@Column(name="grade_short_name")
	private String gradeShortName;

	@Column(name="grade_ta")
	private double gradeTa;

	//bi-directional many-to-one association to EmpGrade
	@OneToMany(mappedBy="gradePay")
	private List<EmpGrade> empGrades;

	public GradePay() {
	}

	public int getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public double getGradeBasic() {
		return this.gradeBasic;
	}

	public void setGradeBasic(double gradeBasic) {
		this.gradeBasic = gradeBasic;
	}

	public double getGradeBonus() {
		return this.gradeBonus;
	}

	public void setGradeBonus(double gradeBonus) {
		this.gradeBonus = gradeBonus;
	}

	public double getGradeDa() {
		return this.gradeDa;
	}

	public void setGradeDa(double gradeDa) {
		this.gradeDa = gradeDa;
	}

	public double getGradeHra() {
		return this.gradeHra;
	}

	public void setGradeHra(double gradeHra) {
		this.gradeHra = gradeHra;
	}

	public double getGradeMa() {
		return this.gradeMa;
	}

	public void setGradeMa(double gradeMa) {
		this.gradeMa = gradeMa;
	}

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public double getGradePf() {
		return this.gradePf;
	}

	public void setGradePf(double gradePf) {
		this.gradePf = gradePf;
	}

	public double getGradePt() {
		return this.gradePt;
	}

	public void setGradePt(double gradePt) {
		this.gradePt = gradePt;
	}

	public String getGradeShortName() {
		return this.gradeShortName;
	}

	public void setGradeShortName(String gradeShortName) {
		this.gradeShortName = gradeShortName;
	}

	public double getGradeTa() {
		return this.gradeTa;
	}

	public void setGradeTa(double gradeTa) {
		this.gradeTa = gradeTa;
	}

	public List<EmpGrade> getEmpGrades() {
		return this.empGrades;
	}

	public void setEmpGrades(List<EmpGrade> empGrades) {
		this.empGrades = empGrades;
	}

	public EmpGrade addEmpGrade(EmpGrade empGrade) {
		getEmpGrades().add(empGrade);
		empGrade.setGradePay(this);

		return empGrade;
	}

	public EmpGrade removeEmpGrade(EmpGrade empGrade) {
		getEmpGrades().remove(empGrade);
		empGrade.setGradePay(null);

		return empGrade;
	}

}