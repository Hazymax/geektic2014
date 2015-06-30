package com.ninja_squad.geektic.data;

import java.util.HashSet;
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
	
	private String sexe;

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

	public String getSexe() {
		return sexe;
	}

	public Set<Interet> getInterets() {
		return interets;
	}
	
	public Set<String> getInteretsString(){
		Set<String> liste = new HashSet<String>() ;
		for(Interet interet : interets){
			liste.add(interet.getLibelle());
		}
		return liste;
	}
}
