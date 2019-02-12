package com.lti.felicityhomeloan.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.felicityhomeloan.dto.LoginDTO;
import com.lti.felicityhomeloan.entity.PersonalDetailsEntity;

@Repository
public class LoginRepository {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public PersonalDetailsEntity fetchUser(LoginDTO loginDTO) {
	Query query = entityManager.createQuery("select user from PersonalDetailsEntity as user where user.emailId=:emailId and user.password=:password");
	query.setParameter("emailId", loginDTO.getEmailId() );
	query.setParameter("password", loginDTO.getPassword());
	
	try {
		return (PersonalDetailsEntity) query.getSingleResult();
	}
	catch (NoResultException noResultException) {
		return null;
	}
	}
	
}
