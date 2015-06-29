package com.ninja_squad.geektic.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja_squad.geektic.DAO.InteretDAO;
import com.ninja_squad.geektic.data.Interet;

@Service
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
