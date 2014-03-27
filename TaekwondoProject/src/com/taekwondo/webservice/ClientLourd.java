package com.taekwondo.webservice;



import java.util.ArrayList;

import javax.jws.WebMethod;  
import javax.jws.WebService;  

import com.taekwondo.metier.*;
  
@WebService  
public interface ClientLourd {  
  
 @WebMethod public String helloWorld(String name); 
 @WebMethod public Boolean connectionBdd(); 
 @WebMethod public void ajoutCompetition(String nomCompetition, String dateCompetition);
 @WebMethod public void ajoutClub(String nomCompetition, String nomClub); 
 @WebMethod public void ajoutCompetiteur(String nomCompetition, String nomClub, String nomCompetiteur, String prenomCompetiteur, int ageCompetiteur, String genre, int categorie); 
 @WebMethod public void ajoutCategorie(String nomCompetition,String nomcategorie,int ageMini, int ageMaxi);
 @WebMethod public int recuperationCompetition(String nomCompetition); 
 @WebMethod public ArrayList<Competition> recuperationListeCompetition(); 
 @WebMethod public ArrayList<Club> recuperationListeClub(int idCompetition); 
 @WebMethod public ArrayList<Competiteur> recuperationListeCompetiteur(int idClub); 
 @WebMethod public ArrayList<Categorie> recuperationListeCategorie(int idCompetition); 
 @WebMethod public int retrouveIdCategorie(String categorie);
 @WebMethod public void supprimCompetition(String competition);
 @WebMethod public void closeBdd();
 @WebMethod public String retourneNomCategorie(int idcategorie);
}  

