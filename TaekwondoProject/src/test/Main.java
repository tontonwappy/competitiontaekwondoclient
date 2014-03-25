package test;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import org.json.simple.JSONObject;

import com.taekwondo.bdd.*;
import com.taekwondo.webservice.Categorie;
import com.taekwondo.webservice.ClientLourd;
import com.taekwondo.webservice.Club;
import com.taekwondo.webservice.Competiteur;
import com.taekwondo.webservice.Competition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controleur.initConnection();
		//Controleur.ajoutBddCompetition("comp2", "le 10");
		//Controleur.ajoutBddClub("comp2", "yoloteam2");
		//Controleur.ajoutBddCompetiteur("comp2", "yoloteam2", "darkligt2", "cmoi", 20, "M");
		//Controleur.ajoutBddCategorie("comp2", "junior", 15,18 );
		//System.out.println(Controleur.retourneListeCompetition());
		
		//*******************
//		ArrayList<Competition> list =Controleur.retourneListeCompetition();
//		
//		for (Competition comp : list){
//			System.out.println(comp.getNomCompetition());
//		}
		//*******************
//		ArrayList<Club> list =Controleur.retourneListeClub(7);
//		
//		for (Club comp : list){
//			System.out.println(comp.getNom());
//		}
		/***********************/
//		ArrayList<Competiteur> list =Controleur.retourneListeCompetiteur(4);
//		
//		for (Competiteur comp : list){
//			System.out.println(comp.getNom());
//			System.out.println(comp.toString());
//		}
		/***********************/
		ArrayList<Categorie> list =Controleur.retourneListeCategorie(11);
		for (Categorie cat : list){
			System.out.println(cat.getNom());
	
		}
	
	}

}
