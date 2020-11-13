package com.lti.felicityhomeloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.felicityhomeloan.entity.IncomeDetails;
import com.lti.felicityhomeloan.entity.LoanDetails;
import com.lti.felicityhomeloan.entity.LoanStatus;
import com.lti.felicityhomeloan.entity.PersonalDetails;
import com.lti.felicityhomeloan.entity.PropertyDetails;
import com.lti.felicityhomeloan.service.HomeLoanService;

@RestController
@CrossOrigin
public class HomeLoancontroller {
	@Autowired
	private HomeLoanService homeLoanService;

	@RequestMapping(path = "/propertydetails/add", method = RequestMethod.POST)
	public Object add(@RequestBody PropertyDetails propertyDetails) {
		return homeLoanService.add(propertyDetails);
		
	}

	@RequestMapping(path = "/incomedetails/add", method = RequestMethod.POST)
	public String add(@RequestBody IncomeDetails incomeDetails) {
		homeLoanService.add(incomeDetails);
		return "{\"status\" : \"Income Details added successfully!\"}";
	}

	@RequestMapping(path = "/loandetails/add", method = RequestMethod.POST)
	public String add(@RequestBody LoanDetails loanDetails) {
		homeLoanService.add(loanDetails);
		return "{\"status\" : \"Loan Details added successfully!\"}";
	}

	@RequestMapping(path = "/personaldetails/add", method = RequestMethod.POST)
	public String add(@RequestBody PersonalDetails personalDetails) {
		homeLoanService.add(personalDetails);
		return "{\"status\" : \"Personal Details added successfully!\"}";
	}
	
	@RequestMapping(path = "/loanstatus/add", method = RequestMethod.POST)
	public String add(@RequestBody LoanStatus loanStatus) {
		homeLoanService.add(loanStatus);
		return "{\"status\" : \"Loan Status added successfully!\"}";
	}
	
	@CrossOrigin
	@RequestMapping(path="/propertydetails/{id}", method=RequestMethod.GET)
	public PropertyDetails fetchPropertyDetails(@PathVariable("id") int id) {
		return homeLoanService.fetchPropertyDetails(id);
	}
	
	@CrossOrigin
	@RequestMapping(path="/incomedetails/{id}", method=RequestMethod.GET)
	public IncomeDetails fetchIncomeDetails(@PathVariable("id") int id) {
		return homeLoanService.fetchIncomeDetails(id);
	}
	
	@CrossOrigin
	@RequestMapping(path="/loandetails/{id}", method=RequestMethod.GET)
	public LoanDetails fetchLoanDetails(@PathVariable("id") int id) {
		return homeLoanService.fetchLoanDetails(id);
	}
	
	@CrossOrigin
	@RequestMapping(path="/personaldetails/{id}", method=RequestMethod.GET)
	public PersonalDetails fetchPersonalDetails(@PathVariable("id") int id) {
		return homeLoanService.fetchPersonalDetails(id);
	}
	
	@CrossOrigin
	@RequestMapping(path="/statusdetails/{id}", method=RequestMethod.GET)
	public LoanStatus fetchLoanStatus(@PathVariable("id") int id) {
		return homeLoanService.fetchLoanStatus(id);
	}
	
	@CrossOrigin
	@RequestMapping(path="/applications", method=RequestMethod.GET)
	public List <LoanStatus> fetchApplications() {
		return homeLoanService.fetchAllApplications();
	}
	
	@CrossOrigin
	@RequestMapping(path="/approved", method=RequestMethod.GET)
	public List <LoanStatus> fetchApproved() {
		return homeLoanService.fetchApproved();
	}
	
	@CrossOrigin
	@RequestMapping(path="/toverify", method=RequestMethod.GET)
	public List <LoanStatus> fetchToBeVerified() {
		return homeLoanService.fetchToBeVerified();
	}

}
