package com.lti.felicityhomeloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOAN_DETAILS")
public class LoanDetailsEntity {
	
	@Id
	private int applicationId;
	
	@Column(name="max_amt_grantable")
	private double maxGrantableLoan;
	private double rateOfInterest;
	private int tenure;
	private double loanAmount;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public double getMaxGrantableLoan() {
		return maxGrantableLoan;
	}
	public void setMaxGrantableLoan(double maxGrantableLoan) {
		this.maxGrantableLoan = maxGrantableLoan;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	
}
