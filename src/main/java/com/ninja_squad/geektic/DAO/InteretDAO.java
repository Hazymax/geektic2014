package com.ninja_squad.geektic.DAO;

import javax.persistence.EntityManager;
import com.ninja_squad.geektic.service.Interet;

public class InteretDAO {
	
	private EntityManager entityManager;
	
	public InteretDAO(EntityManager em){
		this.entityManager = em;
	}
	
	public Interet findById(long id){
		return entityManager.find(Interet.class, id);
	}
	
	public void create(Interet interet){
		entityManager.persist(interet);
	}

}
