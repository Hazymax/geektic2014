package com.ninja_squad.geektic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja_squad.geektic.DAO.GeekDAO;
import com.ninja_squad.geektic.data.Geek;

@Service
public class GeekService {

	private GeekDAO geekDAO;
	
	@Autowired
	public GeekService(GeekDAO gDAO){
		this.geekDAO = gDAO;
	}
	
	public List<Geek> findAllGeeks(){
		return geekDAO.findAllGeeks();
	}
	
}
