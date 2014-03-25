package com.taekwondo.webservice;

import java.io.Serializable;
import java.util.ArrayList;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;

@WebService
@XmlRootElement(name = "club")
public class Club  implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6981947146707525084L;
	private int id;
	private String nom;
	
	public Club(int id, String nom){
		this.id=id;
		this.nom=nom;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Club(){}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
