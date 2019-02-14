package com.lti.felicityhomeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.entity.IncomeDetails;
import com.lti.felicityhomeloan.entity.LoanDetails;
import com.lti.felicityhomeloan.entity.PersonalDetails;
import com.lti.felicityhomeloan.entity.PropertyDetails;
import com.lti.felicityhomeloan.repository.BaseRepository;

@Service
public class HomeLoanService {
	@Autowired
	private BaseRepository baseRepository;

	@Transactional
	public void add(PropertyDetails propertyDetails) {
		baseRepository.add(propertyDetails);
	}

	@Transactional
	public void add(IncomeDetails incomeDetails) {
		baseRepository.add(incomeDetails);
	}

	@Transactional
	public void add(LoanDetails loanDetails) {
		baseRepository.add(loanDetails);
	}

	@Transactional
	public void add(PersonalDetails personalDetails) {
		baseRepository.add(personalDetails);
	}

	// public Movie fetch(int id) {
	// return movieRepository.fetch(id);
	// }

}
