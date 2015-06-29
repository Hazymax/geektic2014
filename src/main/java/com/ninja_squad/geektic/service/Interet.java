package com.ninja_squad.geektic.service;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INTERETS")
public class Interet {

	@Id
	@Column(name="ID_INTERET")
	@GeneratedValue
	private long id_interet;
	
	private String libelle;
	
	@ManyToMany(mappedBy = "interets")
	private Set<Geek> geeks;
	
}