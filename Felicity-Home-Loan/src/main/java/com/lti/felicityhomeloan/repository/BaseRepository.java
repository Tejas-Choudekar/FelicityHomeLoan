package com.lti.felicityhomeloan.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BaseRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	// @Transactional
	// public void add(PropertyDetailsEntity propertydetails) {
	// entityManager.persist(propertydetails);
	// }

	@Transactional
	public Object add(Object obj) {
		return entityManager.merge(obj);
	}

	@Transactional
	public <E> E fetchById(Class<E> classname, Object pk) { // <E> E: <Classname>returnType
		E e = entityManager.find(classname,  pk);
		return e;
	
	}

	@Transactional
	public <E> List<E> fetchAll(Class<E> e) { // List<E> or List<?>
		Query q = entityManager.createQuery("from" + e.getName()+ "as obj");
		return q.getResultList();
	}

}
