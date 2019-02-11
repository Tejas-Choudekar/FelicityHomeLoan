package com.lti.felicityhomeloan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.dto.LoginDTO;
import com.lti.felicityhomeloan.entity.IncomeDetailsEntity;
import com.lti.felicityhomeloan.entity.LoanDetailsEntity;
import com.lti.felicityhomeloan.entity.PersonalDetailsEntity;
import com.lti.felicityhomeloan.entity.PropertyDetailsEntity;
import com.lti.felicityhomeloan.repository.HomeLoanRepository;
import com.lti.felicityhomeloan.repository.LoginRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class FelicityHomeLoanApplicationTests {
	
	@Autowired
	private HomeLoanRepository homeLoanRepo;
	
	@Autowired
	private LoginRepository loginRepo;
	PropertyDetailsEntity propertyDetails = new PropertyDetailsEntity();
	
	

	@Test
	public void contextLoads() {
		
		propertyDetails.setPropertyName("Jalsa");
		propertyDetails.setPropertyLocation("Juhu Beach");
		propertyDetails.setEstimatedAmount(5000000);
		
		homeLoanRepo.genericadd(propertyDetails);
	}
	
	@Test
	public void testIncomeDetails() {
		IncomeDetailsEntity incomeDetails = new IncomeDetailsEntity();
		incomeDetails.setTypeOfEmployee("Selfemployeed");
		incomeDetails.setRetirementAge(68);
		incomeDetails.setOrganisationType("Entertainment");
		incomeDetails.setEmployeerName("Bollywood");
		incomeDetails.setSalary(500000);
		
		homeLoanRepo.genericadd(incomeDetails);
	}
	
	@Test
	public void testLoanDetails() {
		LoanDetailsEntity loanDetails = new LoanDetailsEntity();
		//loanDetails.setApplicationId(0003);
		loanDetails.setMaxGrantableLoan(50000);
		loanDetails.setRateOfInterest(5);
		loanDetails.setTenure(2);
		loanDetails.setLoanAmount(20000);
		homeLoanRepo.genericadd(loanDetails);
	}
	
	@Test
	public void testPersonalDetails () {
		PersonalDetailsEntity personalDetails = new PersonalDetailsEntity();
		//personalDetails.setApplicationId(0003);
		personalDetails.setFirstName("Amitabh");
		personalDetails.setLastName("Bacchan");
		personalDetails.setMiddleName("Rajesh");
		personalDetails.setBirthDate("17/05/1946");
		personalDetails.setPhoneNumber("9209848233");
		personalDetails.setAdharNumber("440030014246");
		personalDetails.setNationality("Indian");
		personalDetails.setEmailId("amit.bacchan@gmail.com");
		personalDetails.setPassword("amitbacchan123");
		personalDetails.setConfirmPassword("amitbacchan123");
		personalDetails.setPanNumber("BUCKO210K");
		personalDetails.setGender("Male");
		homeLoanRepo.genericadd(personalDetails);
	}
	
	@Test
	@Transactional
	public void testLogin () {
		LoginDTO login = new LoginDTO();
		login.setEmailId("amit.bacchan@gmail.com");
		login.setPassword("amitbacchan123");
		loginRepo.fetchUser(login);
	}

}

