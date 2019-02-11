package com.lti.felicityhomeloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INCOME_DETAILS")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class IncomeDetailsEntity {
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Id
	private int incomeId;
	
	@Column
	private String typeOfEmployee;
	
	@Column
	private int retirementAge;
	
	@Column
	private String organisationType;
	
	@Column
	private String employeerName;
	
	@Column
	private double salary;
	
	//PropertyDetailsEntity propertyDetails = new PropertyDetailsEntity();

	public IncomeDetailsEntity(int incomeId, String typeOfEmployment, int retirementAge, String organizationType,
			String employerName, double salary) {
		super();
		this.incomeId = incomeId;
		this.typeOfEmployee = typeOfEmployment;
		this.retirementAge = retirementAge;
		this.organisationType = organizationType;
		this.employeerName = employerName;
		this.salary = salary;
	}
	
	public IncomeDetailsEntity() {
		super();
	}
	
	
	public int getIncomeId() {
		return incomeId;
	}
	public void setIncomeId(int incomeId) {
		this.incomeId = incomeId;
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
	
	@Override
	public String toString() {
		return "IncomeDetailsEntity [incomeId=" + incomeId + ", typeOfEmployee=" + typeOfEmployee + ", retirementAge="
				+ retirementAge + ", organisationType=" + organisationType + ", employeerName=" + employeerName
				+ ", salary=" + salary +  "]";
	}
	
}
