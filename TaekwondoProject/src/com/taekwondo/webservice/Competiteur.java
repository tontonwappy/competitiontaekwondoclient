package com.taekwondo.webservice;

import java.io.Serializable;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;

@WebService
@XmlRootElement(name = "competiteur")
public class Competiteur  implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1119009845909241085L;
	private String nom;
	private String prenom;
	private int age;
	private String genre;
	private int categorie;
	private int id;
	
	@Override
	public String toString() {
		return "Competiteur [nom=" + nom + ", prenom=" + prenom + ", age="
				+ age + ", genre=" + genre + ", categorie=" + categorie + "]";
	}

	public Competiteur( String nom, String prenom, int age,String genre,int categorie,int id){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.genre=genre;
		this.categorie=categorie;
		this.setId(id);
	}
	
	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	public Competiteur() {
		// TODO Auto-generated constructor stub
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


//	public String toString(){
//		return("** nom :"+this.getNom()+" //prenom :"+this.getPrenom()+"//age :"+this.getAge()+"//club :"+this.getClub().getNom()+"// Categorie"+this.getCategorie().getNom()+"**");
//	}


	


	
}

