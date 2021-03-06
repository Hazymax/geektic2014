package com.ninja_squad.geektic.controleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.ninja_squad.geektic.data.Geek;
import com.ninja_squad.geektic.data.Interet;
import com.ninja_squad.geektic.service.GeekService;
import com.ninja_squad.geektic.service.InteretService;

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

    @RequestMapping(method = RequestMethod.GET, value="/initGeeks")
    @ResponseStatus(HttpStatus.OK)
    public List<Geek> geeks(){
    	return geekService.findAllGeeks();
    }

    @RequestMapping(method = RequestMethod.GET, value="/initInterets")
    @ResponseStatus(HttpStatus.OK)
    public List<Interet> interets(){
        return interetService.findAllInteret();
    }

    @RequestMapping(method = RequestMethod.GET, value="/searchGeeks")
    @ResponseStatus(HttpStatus.OK)
    public List<Geek> searchGeeks(@RequestParam("sexeToSearch") String sexe,@RequestParam("interetToSearch") String interet){
    	List<Geek> liste = geeks();
    	List<Geek> geeksFind = new ArrayList<>();
    	for(Geek geekIteration : liste){
    		if(geekIteration.getSexe().trim().equals(sexe.trim()) && geekIteration.getInteretsString().contains(interet))
    			geeksFind.add(geekIteration);
    		
    	}
    	System.out.println("\n \n \n LISTE<Geek>.SIZE = " + geeksFind.size() + "\n \n \n");
    	return geeksFind;
    }
    
}
