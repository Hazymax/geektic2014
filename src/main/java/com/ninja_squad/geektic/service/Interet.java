package com.ninja_squad.geektic.service;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Interet {

	private String libelle;
	
	@ManyToMany(mappedBy = "interets")
	private Set<Geek> geeks;
	
}