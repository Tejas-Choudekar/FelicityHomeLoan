package com.lti.felicityhomeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.felicityhomeloan.entity.IncomeDetails;
import com.lti.felicityhomeloan.entity.LoanDetails;
import com.lti.felicityhomeloan.entity.PersonalDetails;
import com.lti.felicityhomeloan.entity.PropertyDetails;
import com.lti.felicityhomeloan.service.HomeLoanService;

@RestController
@CrossOrigin
public class HomeLoancontroller {
	@Autowired
	private HomeLoanService homeLoanService;

	@RequestMapping(path = "/propertydetails/add", method = RequestMethod.POST)
	public String add(@RequestBody PropertyDetails propertyDetails) {
		homeLoanService.add(propertyDetails);
		return "{\"status\" : \"Property Details added successfully!\"}";
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

	// @RequestMapping(path="/movie/{id}", method=RequestMethod.GET)
	// public Movie fetch(@PathVariable("id") int id) {
	// return movieService.fetch(id);
	// }

}
