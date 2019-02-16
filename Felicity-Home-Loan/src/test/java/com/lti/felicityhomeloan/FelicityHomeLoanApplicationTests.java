package com.lti.felicityhomeloan;

import java.text.SimpleDateFormat;

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
import com.lti.felicityhomeloan.entity.IncomeDetails;
import com.lti.felicityhomeloan.entity.LoanDetails;
import com.lti.felicityhomeloan.entity.PersonalDetails;
import com.lti.felicityhomeloan.entity.PropertyDetails;
import com.lti.felicityhomeloan.repository.BaseRepository;
import com.lti.felicityhomeloan.repository.LoginRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
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
		
		//IncomeDetails incomeDetails = new IncomeDetails();
		//incomeDetails.setPropertyDetails(propertyDetails);
		
		//LoanDetails loanDetails = new LoanDetails();
		//loanDetails.setPropertyDetails(propertyDetails);
		
		
		//PersonalDetails personDetails= new PersonalDetails();
		//personDetails.setPropertyDetails(propertyDetails);
		
		
		//propertyDetails.setIncomeDetails(incomeDetails);
		//propertyDetails.setLoanDetails(loanDetails);
		//propertyDetails.setPersonalDetails(personDetails);

		baseRepo.add(propertyDetails);
	}

	@Test
	public void testIncomeDetails() {
		IncomeDetails incomeDetails = new IncomeDetails();
		incomeDetails.setTypeOfEmployee("Selfemployeed");
		incomeDetails.setRetirementAge(68);
		incomeDetails.setOrganisationType("Government");
		incomeDetails.setEmployerName("LTI");
		incomeDetails.setSalary(500000);
		
		
		PropertyDetails propertyDetails = baseRepo.fetchById(PropertyDetails.class, 34902);
		propertyDetails.setIncomeDetails(incomeDetails);
		incomeDetails.setPropertyDetails(propertyDetails);
		
		baseRepo.add(incomeDetails);
	}

	@Test
	public void testLoanDetails() {
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setMaxGrantableLoan(25000);
		loanDetails.setRateOfInterest(8.5);
		loanDetails.setTenure(20);
		loanDetails.setLoanAmount(20000);
		
		PropertyDetails propertyDetails = baseRepo.fetchById(PropertyDetails.class, 34902);
		propertyDetails.setLoanDetails(loanDetails);
		loanDetails.setPropertyDetails(propertyDetails);
		
		baseRepo.add(loanDetails);
	}

	@Test
	public void testPersonalDetails() throws Exception {
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setFirstName("Rishika");
		personalDetails.setLastName("Karna");
		personalDetails.setMiddleName("Rao");
		personalDetails.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse("13/01/1996"));
		personalDetails.setPhoneNumber("9209848233");
		personalDetails.setAadharNumber("440030014246");
		personalDetails.setNationality("Indian");
		personalDetails.setEmailId("rishika25@gmail.com1");
		personalDetails.setPassword("rishika123");
		personalDetails.setPanNumber("BUCKO210K");
		personalDetails.setGender("Female");
		
		PropertyDetails propertyDetails = baseRepo.fetchById(PropertyDetails.class, 34902);
		personalDetails.setPropertyDetails(propertyDetails);
		
		baseRepo.add(personalDetails);
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
