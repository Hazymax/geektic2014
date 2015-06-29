package com.ninja_squad.geektic.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ninja_squad.geektic.data.Geek;

import java.util.ArrayList;
import java.util.List;

public class GeekDAO {
	
	private EntityManager entityManager;
	
	public GeekDAO(EntityManager em){
		this.entityManager = em;
	}
	
	public Geek findById(long id){
		return entityManager.find(Geek.class, id);
	}
	
	public void create(Geek geek){
		entityManager.persist(geek);
	}

	public List<Geek> findAllGeeks() {   
		String jpql = "select v from Geek as v";
		TypedQuery<Geek> query = entityManager.createQuery(jpql,Geek.class);
		return query.getResultList();
	}

}
