package com.ninja_squad.geektic.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.data.Interet;

@Repository
public class InteretDAO {
	
	@PersistenceContext
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

	public List<Interet> findAll() {
    	String jpql = "select v from Interet as v";
    	TypedQuery<Interet> query = entityManager.createQuery(jpql, Interet.class);
    	return query.getResultList();
	}

}
