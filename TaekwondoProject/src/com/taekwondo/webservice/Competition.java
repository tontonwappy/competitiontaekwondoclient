package com.taekwondo.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;

@WebService
@XmlRootElement(name = "competition")
public class Competition implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5949232266657711640L;
	private int id;
	private String nomCompetition;
	private String dateCompetition;

	
	public Competition(int id,String nomCompetition, String dateCompetition) {
		this.id=id;
		this.nomCompetition = nomCompetition;
		this.dateCompetition = dateCompetition;
	}

	public Competition() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateCompetition() {
		return dateCompetition;
	}
	public void setDateCompetition(String dateCompetition) {
		this.dateCompetition = dateCompetition;
	}
	public String getNomCompetition() {
		return nomCompetition;
	}
	public void setNomCompetition(String nomCompetition) {
		this.nomCompetition = nomCompetition;
	}
	


}
