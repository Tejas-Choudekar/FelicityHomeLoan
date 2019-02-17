package com.lti.felicityhomeloan.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.dto.LoginDTO;
import com.lti.felicityhomeloan.entity.PersonalDetails;

@Repository
public class LoginRepository {

	@PersistenceContext
	protected EntityManager entityManager;
	@Transactional
	public PersonalDetails fetchUser(LoginDTO loginDTO) {
	Query query = entityManager.createQuery("select obj from PersonalDetails as obj where obj.emailId=:email and obj.password=:password");
	query.setParameter("email", loginDTO.getEmailId());
	query.setParameter("password", loginDTO.getPassword());

		PersonalDetails pd=	((PersonalDetails) query.getSingleResult());
		System.out.println(pd.getPassword());
		if(pd.getPassword().equals(loginDTO.getPassword()))
			System.out.println(pd.getPassword());
	return (PersonalDetails) query.getSingleResult();
	}



}
