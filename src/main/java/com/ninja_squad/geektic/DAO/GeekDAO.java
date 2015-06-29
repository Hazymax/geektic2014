package com.ninja_squad.geektic.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.data.Geek;

import java.util.List;

@Repository
public class GeekDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
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
