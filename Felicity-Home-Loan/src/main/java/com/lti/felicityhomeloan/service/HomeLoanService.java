package com.lti.felicityhomeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.entity.IncomeDetailsEntity;
import com.lti.felicityhomeloan.entity.LoanDetailsEntity;
import com.lti.felicityhomeloan.entity.PersonalDetailsEntity;
import com.lti.felicityhomeloan.entity.PropertyDetailsEntity;
import com.lti.felicityhomeloan.repository.HomeLoanRepository;


@Service
public class HomeLoanService {
	@Autowired
	private HomeLoanRepository homeLoanRepository;
	
	@Transactional
	public void add(PropertyDetailsEntity propertyDetails) {
		homeLoanRepository.genericadd(propertyDetails);
	}
	
	@Transactional
	public void add(IncomeDetailsEntity incomeDetails) {
		homeLoanRepository.genericadd(incomeDetails);
	}
	
	@Transactional
	public void add(LoanDetailsEntity loanDetails) {
		homeLoanRepository.genericadd(loanDetails);
	}
	
	@Transactional
	public void add(PersonalDetailsEntity personalDetails) {
		homeLoanRepository.genericadd(personalDetails);
	}
	
	//public Movie fetch(int id) {
		//return movieRepository.fetch(id);
	//}

}
