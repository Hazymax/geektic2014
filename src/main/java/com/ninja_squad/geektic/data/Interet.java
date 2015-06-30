package com.ninja_squad.geektic.data;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "INTERETS")
public class Interet {

	@Id
	@Column(name="ID_INTERET")
	@GeneratedValue
	private long id_interet;
	
	private String libelle;
	
	public long getId_interet() {
		return id_interet;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Geek> getGeeks() {
		return geeks;
	}

	@JsonIgnore
	@ManyToMany(mappedBy = "interets")
	private Set<Geek> geeks;
	
	
}