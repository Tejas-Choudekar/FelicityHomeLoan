package com.lti.felicityhomeloan.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class HomeLoanRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	//@Transactional
	//public void add(PropertyDetailsEntity propertydetails) {
		//entityManager.persist(propertydetails);
	//}
	
	@Transactional
	public void genericadd(Object obj) {
		entityManager.persist(obj);
	}

	//public Movie fetch(int id) {
		//return entityManager.find(Movie.class, id);
	//}

}
