package com.ninja_squad.geektic.service;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Geek {

	@Id
	@Column(name="ID_GEEK")
	@GeneratedValue
	private long id_geek;
	
	private String name;
	
	private char sexe;

	@ManyToMany
	@JoinTable(name = "GEEK_INTERET",
			joinColumns = @JoinColumn(name="ID_GEEK"),
			inverseJoinColumns = @JoinColumn(name = "LIBELLE"))
	private Set<Interet> interets;
	
}
