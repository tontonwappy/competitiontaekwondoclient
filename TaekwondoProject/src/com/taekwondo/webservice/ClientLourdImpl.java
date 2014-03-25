package com.taekwondo.webservice;



import java.util.ArrayList;

import javax.jws.WebService;  







import com.taekwondo.bdd.Controleur;
import com.taekwondo.metier.*;

@WebService(endpointInterface="com.taekwondo.webservice.ClientLourd")  
public class ClientLourdImpl implements ClientLourd{  

	public String helloWorld(String name) {  
		return "Hello world from "+name;  
	}  

	public Boolean connectionBdd(){ 
		return Controleur.initConnection();
	}

	public void ajoutCompetition(String nomCompetition, String dateCompetition){
		Controleur.initConnection();
		Controleur.ajoutBddCompetition(nomCompetition,dateCompetition);
	}

	@Override
	public void ajoutClub(String nomCompetition, String nomClub) {
		Controleur.initConnection();

	}

	@Override
	public void ajoutCompetiteur(String nomCompetition, String nomClub,
			String nomCompetiteur, String prenomCompetiteur, int ageCompetiteur,String genre) {
		Controleur.initConnection();
		Controleur.ajoutBddCompetiteur(nomCompetition,nomClub,nomCompetition, prenomCompetiteur, ageCompetiteur, genre);
	}

	@Override
	public int recuperationCompetition(String nomCompetition) {
		Controleur.initConnection();
		return Controleur.retourneCompetition(nomCompetition);
	}

	@Override
	public ArrayList<Competition> recuperationListeCompetition() {
		Controleur.initConnection();
		return Controleur.retourneListeCompetition();
	}

	@Override
	public ArrayList<Club> recuperationListeClub(int idCompetition) {
		Controleur.initConnection();
		return Controleur.retourneListeClub(idCompetition);
	}

	@Override
	public ArrayList<Competiteur> recuperationListeCompetiteur(int idClub) {
		Controleur.initConnection();
		return Controleur.retourneListeCompetiteur(idClub);
	}

	@Override
	public void ajoutBddCategorie(String nomCompetition, String nomcategorie,
			int ageMini, int ageMaxi) {
		Controleur.initConnection();
		Controleur.ajoutBddCategorie(nomCompetition, nomcategorie, ageMini, ageMaxi);

	}

	@Override
	public ArrayList<Categorie> recuperationListeCategorie(int idCompetition) {
		Controleur.initConnection();
		return Controleur.retourneListeCategorie(idCompetition);
	}
}  

