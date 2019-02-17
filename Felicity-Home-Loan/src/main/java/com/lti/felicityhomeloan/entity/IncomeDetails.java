package com.lti.felicityhomeloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "INCOME_DETAILS")
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
public class IncomeDetails {
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Id
	private int incomeDetailsId;

	@Column
	private String typeOfEmployee;

	@Column
	private int retirementAge;

	@Column
	private String organisationType;

	@Column
	private String employerName;

	@Column
	private double salary;
		
	public int getIncomeDetailsId() {
		return incomeDetailsId;
	}

	public void setIncomeDetailsId(int incomeDetailsId) {
		this.incomeDetailsId = incomeDetailsId;
	}

	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public int getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}

	public String getOrganisationType() {
		return organisationType;
	}

	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
