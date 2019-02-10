package com.lti.felicityhomeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.felicityhomeloan.entity.IncomeDetailsEntity;
import com.lti.felicityhomeloan.entity.LoanDetailsEntity;
import com.lti.felicityhomeloan.entity.PersonalDetailsEntity;
import com.lti.felicityhomeloan.entity.PropertyDetailsEntity;
import com.lti.felicityhomeloan.service.HomeLoanService;

@RestController
@CrossOrigin
public class HomeLoancontroller {
	@Autowired
	private HomeLoanService homeLoanService;
	
	@RequestMapping(path="/propertydetailsentity/genericadd", method=RequestMethod.POST)
	public String add(@RequestBody PropertyDetailsEntity propertyDetails) {
		homeLoanService.add(propertyDetails);
		return "{\"status\" : \"Property Detais added successfully!\"}";
	}
	
	@RequestMapping(path="/incomedetailsentity/genericadd", method=RequestMethod.POST)
	public String add(@RequestBody IncomeDetailsEntity incomeDetails) {
		homeLoanService.add(incomeDetails);
		return "{\"status\" : \"Income Detais added successfully!\"}";
	}
	
	@RequestMapping(path="/loandetailsentity/genericadd", method=RequestMethod.POST)
	public String add(@RequestBody LoanDetailsEntity loanDetails) {
		homeLoanService.add(loanDetails);
		return "{\"status\" : \"Loan Detais added successfully!\"}";
	}
	
	@RequestMapping(path="/personaldetailsentity/genericadd", method=RequestMethod.POST)
	public String add(@RequestBody PersonalDetailsEntity personalDetails) {
		homeLoanService.add(personalDetails);
		return "{\"status\" : \"Personal Detais added successfully!\"}";
	}
	
	//@RequestMapping(path="/movie/{id}", method=RequestMethod.GET)
	//public Movie fetch(@PathVariable("id") int id) {
		//return movieService.fetch(id);
	//}

}
