
package com.taekwondo.bdd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.taekwondo.metier.*;
import com.taekwondo.webservice.Categorie;
import com.taekwondo.webservice.Club;
import com.taekwondo.webservice.Competiteur;
import com.taekwondo.webservice.Competition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controleur {
	static Statement s = null;
	static Connection c = null;
	public static Boolean initConnection(){
		Boolean connected=false;
		System.out.println("Checking if Driver is registered with DriverManager.");

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Couldn't find the driver!");
			System.out.println("Let's print a stack trace, and exit.");
			cnfe.printStackTrace();
			System.exit(1);
		}

		System.out.println("Registered the driver ok, so let's make a connection.");


		try {
			c = DriverManager.getConnection("jdbc:postgresql://localhost/BaseTaekwondo",
					"jonathan", "admin");
			s = c.createStatement();
		} catch (SQLException se) {
			System.out.println("Couldn't connect: print out a stack trace and exit.");
			se.printStackTrace();
			System.exit(1);
		}

		if (c != null){
			System.out.println("Hooray! We connected to the database!");
			connected=true;
		}
		else
			System.out.println("We should never get here.");
		return connected;
	}



	public static void ajoutBddCompetition(String nomCompetition,String dateCompetition){
		try {	
			int m = 0;
			System.out.println("insertion de");
			System.out.println(nomCompetition);
			System.out.println("***********");
			System.out.println(dateCompetition);
			m=s.executeUpdate("INSERT INTO competition VALUES ('"+nomCompetition+"','"+dateCompetition+"',default);");	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static void ajoutBddClub(String nomCompetition,String club){
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			int id=0;
			ResultSet rs = stmt.executeQuery("select * from competition WHERE \"nomCompetition\"='"+nomCompetition+"'");			
			while (rs.next()) {
				//String competition = rs.getString("nomCompetition");
				// String date = rs.getString("dateCompetition");
				id = rs.getInt("idCompetition");
				//System.out.println(date + "\t" + competition +"\t"+id );                          
			}	
			if(id!=0){
				s.executeUpdate("INSERT INTO club VALUES (default,'"+club+"','"+id+"');");		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void ajoutBddCategorie(String nomCompetition,String nomcategorie,int ageMini, int ageMaxi){
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			int id=0;
			ResultSet rs = stmt.executeQuery("select * from competition WHERE \"nomCompetition\"='"+nomCompetition+"'");			
			while (rs.next()) {
				//String competition = rs.getString("nomCompetition");
				// String date = rs.getString("dateCompetition");
				id = rs.getInt("idCompetition");
				//System.out.println(date + "\t" + competition +"\t"+id );                          
			}	
			if(id!=0){
				s.executeUpdate("INSERT INTO categorie VALUES (default,'"+nomcategorie+"','"+ageMini+"','"+ageMaxi+"','"+id+"');");		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void ajoutBddCompetiteur (String nomCompetition,String club,String nom, String prenom, int age, String genre){
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			int idCompetition=0;
			int idClub=0;
			ResultSet rs = stmt.executeQuery("select * from competition WHERE \"nomCompetition\"='"+nomCompetition+"'");			
			while (rs.next()) {
				idCompetition = rs.getInt("idCompetition");                  
			}	
			System.out.println(club);
			rs = stmt.executeQuery("select * from club WHERE \"nomClub\"='"+club+"' AND \"Competition_idCompetition\"='"+idCompetition+"'");			
			while (rs.next()) {
				idClub = rs.getInt("idClub");                  
			}

			s.executeUpdate("INSERT INTO combattant VALUES ('"+nom+"','"+prenom+"','"+age+"','"+genre+"','"+idClub+"',default) ;");		 


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Competition> retourneListeCompetition (){	
		ArrayList<Competition> list=new ArrayList<Competition>();
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			ResultSet rs = stmt.executeQuery("select \"idCompetition\",\"nomCompetition\",\"dateCompetition\" from competition");			
			while (rs.next()) {
				list.add(new Competition(rs.getInt("idCompetition"),rs.getString("nomCompetition"),rs.getString("dateCompetition")));       
			}	

		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;
	}
	
	public static ArrayList<Club> retourneListeClub (int idCompetition){	
		ArrayList<Club> list=new ArrayList<Club>();
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			ResultSet rs = stmt.executeQuery("select \"idClub\",\"nomClub\" from club WHERE \"Competition_idCompetition\"='"+idCompetition+"'");			
			while (rs.next()) {
				list.add(new Club(rs.getInt("idClub"),rs.getString("nomClub")));       
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;
	}

	public static int retourneCompetition (String nomCompetition){	
		int numCompetition=0;
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			ResultSet rs = stmt.executeQuery("select \"idComptition\" from competition WHERE \"nomCompetition\"='"+nomCompetition+"'");			
			while (rs.next()) {
				numCompetition=rs.getInt("nomCompetition");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return numCompetition;
	}

	
	public static ArrayList<Competiteur> retourneListeCompetiteur (int idClub){	
		ArrayList<Competiteur> list=new ArrayList<Competiteur>();
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			ResultSet rs = stmt.executeQuery("select * from combattant WHERE \"Club_idClub\"='"+idClub+"'");			
			while (rs.next()) {
				list.add(new Competiteur(rs.getString("nomCombattant"),rs.getString("prenomCombattant"),rs.getInt("ageCombattant"),rs.getString("genreComattant"),rs.getString("categorieCombattant")));       
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;
	}

	
	public static ArrayList<Categorie> retourneListeCategorie (int idCompetition){	
		ArrayList<Categorie> list=new ArrayList<Categorie>();
		try {	
			Statement stmt = null;
			stmt = c.createStatement();		
			ResultSet rs = stmt.executeQuery("select * from categorie WHERE \"competetion_id\"='"+idCompetition+"'");			
			while (rs.next()) {
				list.add(new Categorie(rs.getString("nomCategorie"),rs.getInt("ageMini"),rs.getInt("ageMaxi")));       
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;
	}

	
}








