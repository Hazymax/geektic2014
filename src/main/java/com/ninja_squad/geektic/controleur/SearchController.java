package com.ninja_squad.geektic.controleur;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.ninja_squad.geektic.DAO.GeekDAO;
import com.ninja_squad.geektic.data.Geek;
import com.ninja_squad.geektic.data.Interet;
import com.ninja_squad.geektic.service.GeekService;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	private GeekService geekService;
	private InteretService interetService;
	
	@Autowired
	public SearchController(GeekService gs,InteretService intService){
		this.geekService = gs;
		this.interetService = intService;
	}

    @RequestMapping(method = RequestMethod.GET, value="/geeks")
    @ResponseStatus(HttpStatus.OK)
    public List<Geek> geeks(){
    	return geekService.findAllGeeks();
    }

    @RequestMapping(method = RequestMethod.GET, value="/interets")
    @ResponseStatus(HttpStatus.OK)
    public List<Interet> interets(){
        return interetService.findAllInteret();
    }

}
