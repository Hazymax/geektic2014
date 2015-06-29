package com.ninja_squad.geektic.DAO;

import javax.persistence.EntityManager;

import com.ninja_squad.geektic.service.Geek;

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

}
