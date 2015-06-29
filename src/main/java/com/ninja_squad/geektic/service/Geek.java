package com.ninja_squad.geektic.service;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Geek {

	@Id
	@Column(name="ID_GEEK")
	@GeneratedValue
	private long id_geek;
	
	private String name;
	
	private char sexe;
	
	private ArrayList<String> interets;
	
}
