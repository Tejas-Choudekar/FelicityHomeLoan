package com.lti.felicityhomeloan.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.entity.LoanStatus;

@Repository
public class AdminRepository {
	@PersistenceContext
	protected EntityManager entityManager;
	@Transactional
	public List <LoanStatus> fetchApps() {
	Query query = entityManager.createQuery("select obj from LoanStatus as obj");
	return query.getResultList();
	}
	
	@Transactional
	public List <LoanStatus> fetchApprove() {
	Query query = entityManager.createQuery("select obj from LoanStatus as obj where obj.status=:status");
	query.setParameter("status", "Accepted");
	return query.getResultList();
	}
	
	@Transactional
	public List <LoanStatus> fetchToBeVerified() {
	Query query = entityManager.createQuery("select obj from LoanStatus as obj where obj.status=:status");
	query.setParameter("status", "To Be Verified");
	return query.getResultList();
	}

}
