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
		Controleur.ajoutBddCompetition(nomCompetition,dateCompetition);
	}

	@Override
	public void ajoutClub(String nomCompetition, String nomClub) {
		Controleur.ajoutBddClub(nomCompetition, nomClub);
	}

	@Override
	public void ajoutCompetiteur(String nomCompetition, String nomClub,
			String nomCompetiteur, String prenomCompetiteur, int ageCompetiteur,String genre, int categorie) {
		Controleur.ajoutBddCompetiteur(nomCompetition,nomClub,nomCompetiteur, prenomCompetiteur, ageCompetiteur, genre, categorie);
	}

	@Override
	public int recuperationCompetition(String nomCompetition) {
		return Controleur.retourneCompetition(nomCompetition);
	}

	@Override
	public ArrayList<Competition> recuperationListeCompetition() {
		return Controleur.retourneListeCompetition();
	}

	@Override
	public ArrayList<Club> recuperationListeClub(int idCompetition) {
		return Controleur.retourneListeClub(idCompetition);
	}

	@Override
	public ArrayList<Competiteur> recuperationListeCompetiteur(int idClub) {
		return Controleur.retourneListeCompetiteur(idClub);
	}

	@Override
	public void ajoutCategorie(String nomCompetition, String nomcategorie,
			int ageMini, int ageMaxi) {
		Controleur.ajoutBddCategorie(nomCompetition, nomcategorie, ageMini, ageMaxi);

	}

	@Override
	public ArrayList<Categorie> recuperationListeCategorie(int idCompetition) {
		return Controleur.retourneListeCategorie(idCompetition);
	}
	
	@Override
	public int retrouveIdCategorie(String categorie) {
		return Controleur.retrouveIdCategorie(categorie);
	}

	@Override
	public void supprimCompetition(String competition) {
		Controleur.supprimCompetition(competition);
	}

	@Override
	public void closeBdd() {
		Controleur.CloseConnection();
	}

	@Override
	public String retourneNomCategorie(int idcategorie) {
		return Controleur.retrouveNomCategorie(idcategorie);
	}


	
}  

