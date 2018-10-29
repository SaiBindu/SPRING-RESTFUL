package com.cg.springrestful.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springrestful.dto.Mobile;

@Repository("mobiledao")

public class MobileDaoImpl implements IMobileDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Mobile> getAllData() {
		// TODO Auto-generated method stub
		
		Query query = em.createQuery("FROM Mobile");
		List<Mobile> myList = query.getResultList();
		
		return myList;
	}

}
