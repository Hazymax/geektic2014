package com.ninja_squad.geektic.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.geektic.DAO.InteretDAO;
import com.ninja_squad.geektic.data.Interet;

public class InteretService {

	private InteretDAO interetDAO;
	
	@Autowired
	public InteretService(InteretDAO intDAO){
		this.interetDAO = intDAO;
	}

	public List<Interet> findAllInteret() {
		return interetDAO.findAll();
	}
	
}
