package com.lti.felicityhomeloan;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.dto.LoginDTO;
import com.lti.felicityhomeloan.entity.IncomeDetails;
import com.lti.felicityhomeloan.entity.LoanDetails;
import com.lti.felicityhomeloan.entity.LoanStatus;
import com.lti.felicityhomeloan.entity.PersonalDetails;
import com.lti.felicityhomeloan.entity.PropertyDetails;

import com.lti.felicityhomeloan.repository.BaseRepository;
import com.lti.felicityhomeloan.repository.LoginRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class FelicityHomeLoanApplicationTests {

	@Autowired
	private BaseRepository baseRepo;

	@Autowired
	private LoginRepository loginRepo;
	

	
@Test
	public void contextLoads() {
		PropertyDetails propertyDetails = new PropertyDetails();
		propertyDetails.setPropertyName("Army Colony");
		propertyDetails.setPropertyLocation("Nerul");
		propertyDetails.setEstimatedAmount(5000000);
		baseRepo.add(propertyDetails);
	}

	@Test
	public void testIncomeDetails() {
		IncomeDetails incomeDetails = new IncomeDetails();
		incomeDetails.setIncomeDetailsId(44102);
		incomeDetails.setTypeOfEmployee("Selfemployeed");
		incomeDetails.setRetirementAge(68);
		incomeDetails.setOrganisationType("Government");
		incomeDetails.setEmployerName("LTI");
		incomeDetails.setSalary(500000);	
		baseRepo.add(incomeDetails);
	}

	@Test
	public void testLoanDetails() {
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setLoanDetailsId(44102);
		loanDetails.setMaxGrantableLoan(25000);
		loanDetails.setRateOfInterest(8.5);
		loanDetails.setTenure(20);
		loanDetails.setLoanAmount(20000);
		baseRepo.add(loanDetails);
	}

	@Test
	public void testPersonalDetails() throws Exception {
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setPersonalDetailsId(44102);
		personalDetails.setFirstName("Rishika");
		personalDetails.setLastName("Karna");
		personalDetails.setMiddleName("Rao");
		personalDetails.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse("13/01/1996"));
		personalDetails.setPhoneNumber("9209848233");
		personalDetails.setAadharNumber("440030014246");
		personalDetails.setNationality("Indian");
		personalDetails.setEmailId("rishika@gmail.com1");
		personalDetails.setPassword("rishika123");
		personalDetails.setPanNumber("BUCKO210K");
		personalDetails.setGender("Female");
		baseRepo.add(personalDetails);
	}
	
	@Test
	public void testLoanStatus() {
		LoanStatus loanstatus = new LoanStatus();
		loanstatus.setStatusId(44102);
		loanstatus.setStatus("To Be Verified");
		
		baseRepo.add(loanstatus);
	}
	
	@Test
	@Transactional
	public void testLogin() {
		LoginDTO login = new LoginDTO();
		login.setEmailId("rishika25@gmail.com1");
		login.setPassword("Rishika@123");
		PersonalDetails pd=loginRepo.fetchUser(login);
		System.out.println(pd.getEmailId());
	}
	
}
