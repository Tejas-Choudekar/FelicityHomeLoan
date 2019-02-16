package com.lti.felicityhomeloan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "LOAN_STATUS")
public class LoanStatus {
	
	@Id
	private String status;
	
	@JsonIgnore
	@OneToOne 
	@JoinColumn(name = "applicationid") 
	private PropertyDetails propertyDetails;

	// PropertyDetailsEntity propertyDetails = new PropertyDetailsEntity();


	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
