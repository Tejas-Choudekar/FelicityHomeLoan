package com.lti.felicityhomeloan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.entity.IncomeDetails;
import com.lti.felicityhomeloan.entity.LoanDetails;
import com.lti.felicityhomeloan.entity.LoanStatus;
import com.lti.felicityhomeloan.entity.PersonalDetails;
import com.lti.felicityhomeloan.entity.PropertyDetails;
import com.lti.felicityhomeloan.repository.AdminRepository;
import com.lti.felicityhomeloan.repository.BaseRepository;

@Service
public class HomeLoanService {
	@Autowired
	private BaseRepository baseRepository;
	
	@Autowired
	private AdminRepository adminRepository;

	@Transactional
	public Object add(PropertyDetails propertyDetails) {
		PropertyDetails pd= (PropertyDetails) baseRepository.add(propertyDetails);
		return pd;
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
	
	@Transactional
	public void add(LoanStatus loanStatus) {
		baseRepository.add(loanStatus);
	}
	
	@Transactional
	 public PropertyDetails fetchPropertyDetails(int id) {
		 return baseRepository.fetchById(PropertyDetails.class,id);
	 }
	@Transactional
	 public IncomeDetails fetchIncomeDetails(int id) {
		 return baseRepository.fetchById(IncomeDetails.class,id);
	 }
	@Transactional
	 public LoanDetails fetchLoanDetails(int id) {
		 return baseRepository.fetchById(LoanDetails.class,id);
	 }
	@Transactional
	 public PersonalDetails fetchPersonalDetails(int id) {
		 return baseRepository.fetchById(PersonalDetails.class,id);
	 }
	@Transactional
	 public LoanStatus fetchLoanStatus(int id) {
		 return baseRepository.fetchById(LoanStatus.class,id);
	 }
	
	@Transactional
	 public List <LoanStatus> fetchAllApplications() {
		 return adminRepository.fetchApps();
	 }
	
	@Transactional
	 public List <LoanStatus> fetchToBeVerified() {
		 return adminRepository.fetchToBeVerified();
	 }
	
	@Transactional
	 public List <LoanStatus> fetchApproved() {
		 return adminRepository.fetchApprove();
	 }

}
