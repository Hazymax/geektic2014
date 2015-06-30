package com.ninja_squad.geektic.data;

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
			inverseJoinColumns = @JoinColumn(name = "ID_INTERET"))
	private Set<Interet> interets;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId_geek() {
		return id_geek;
	}

	public char getSexe() {
		return sexe;
	}

	public Set<Interet> getInterets() {
		return interets;
	}
	
}
