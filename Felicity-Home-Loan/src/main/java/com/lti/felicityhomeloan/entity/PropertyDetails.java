package com.lti.felicityhomeloan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PROPERTY_DETAILS")
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
public class PropertyDetails {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Id
	private int applicationid;
	
	@OneToOne(mappedBy="propertyDetails", cascade= CascadeType.ALL)
	private IncomeDetails incomeDetails;
	
	@OneToOne(mappedBy="propertyDetails", cascade= CascadeType.ALL)
	private LoanDetails loanDetails;
	
	@OneToOne(mappedBy="propertyDetails", cascade= CascadeType.ALL)
	private PersonalDetails personalDetails;
	
	@OneToOne(mappedBy="propertyDetails", cascade= CascadeType.ALL)
	private LoanStatus loanStatus;
	
	public IncomeDetails getIncomeDetails() {
		return incomeDetails;
	}

	public void setIncomeDetails(IncomeDetails incomeDetails) {
		this.incomeDetails = incomeDetails;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public LoanStatus getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatus loanStatus) {
		this.loanStatus = loanStatus;
	}

	private String propertyName;
	private String propertyLocation;
	private double estimatedAmount;

	public int getApplicationid() {
		return applicationid;
	}

	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public double getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(double estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

}
