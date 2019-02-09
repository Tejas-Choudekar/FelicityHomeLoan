package com.lti.felicityhomeloan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INCOME_DETAILS")
public class IncomeDetailsEntity {
	private int applicationId;
	private String typeOfEmployee;
	private int retirementAge;
	private String organisationType;
	private String employeerName;
	private double salary;
	
	PropertyDetailsEntity propertyDetails = new PropertyDetailsEntity();
	@Id
	public int  getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = propertyDetails.getApplicationid();
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
	public String getEmployeerName() {
		return employeerName;
	}
	public void setEmployeerName(String employeerName) {
		this.employeerName = employeerName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
