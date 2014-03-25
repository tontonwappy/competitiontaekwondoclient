package com.taekwondo.webservice;

import java.io.Serializable;
import java.util.ArrayList;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;

@WebService
@XmlRootElement(name = "categorie")
public class Categorie implements  Serializable {

	private static final long serialVersionUID = -6003726445798208474L;
	private String nom;
	private int ageMini;
	private int ageMaxi;

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAgeMini() {
		return ageMini;
	}

	public void setAgeMini(int ageMini) {
		this.ageMini = ageMini;
	}

	public int getAgeMaxi() {
		return ageMaxi;
	}

	public void setAgeMaxi(int ageMaxi) {
		this.ageMaxi = ageMaxi;
	}

	public Categorie(String nom, int ageMini, int ageMaxi){
		this.nom=nom;
		this.ageMini=ageMini;
		this.ageMaxi=ageMaxi;
	}
	
	public Categorie(){}
	

}
