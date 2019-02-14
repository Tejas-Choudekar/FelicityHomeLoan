package com.lti.felicityhomeloan.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.felicityhomeloan.dto.LoginDTO;
import com.lti.felicityhomeloan.entity.PersonalDetails;

@Repository
public class LoginRepository {

	@PersistenceContext
	protected EntityManager entityManager;

	public PersonalDetails fetchUser(LoginDTO loginDTO) {
		Query query = entityManager.createQuery("select user from PersonalDetailsEntity as user"
				+ " where user.emailId=:emailId and user.password=:password");
		query.setParameter("emailId", loginDTO.getEmailId());
		query.setParameter("password", loginDTO.getPassword());

		return (PersonalDetails) query.getSingleResult();
	
	}

}
