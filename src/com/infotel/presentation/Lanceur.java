package com.infotel.presentation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.infotel.metier.Adresse;
import com.infotel.metier.Client;
import com.infotel.metier.Connexion;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iservice service= new ServiceImpl();
		/*Personne p= new Personne();
		p.setNom("ZEC");
		p.setPrenom("Union");	
		p.setAge(25);
		service.ajouterPersonne(p);*/
		
		/*Employe e= new Employe();
		e.setNom("FRAJ");
		e.setPrenom("Khlifa");
		e.setAge(39);
		e.setSalaire(3000);
		service.ajouterPersonne(e);*/
		
		/*Client c= new Client();
		c.setNom("SOUEI");
		c.setPrenom("Imene");
		c.setAge(28);
		c.setNumeroAdherent(1);
		service.ajouterPersonne(c);*/
		
		//Get Personne
		
		/*Personne p2= service.affichagePersonne(1);
		System.out.println(p2);*/
        
		// supprimer Personne
		/*
		Personne p2= service.getPersonne(3);
        service.supprimerPersonne(p2);*/
		
		//afficher personne
		/*Personne p2 = service.affichagePersonne(4);
		System.out.println(p2);*/
		
		//modifier personne
		/*Personne p2= service.affichagePersonne(1);
		p2.setNom("souei");
		p2.setPrenom("layla");
		p2.setAge(28);
		service.modifierPersonne(p2);*/
		
		// Lister personne
	
			/*System.out.println(service.findAllPersonne());*/
        
		// Lister personne avec condition
		
		/*for (Personne p4 : service.rechercherParMc("FR")){
			System.out.println(p4); */
		
		// POUR ADRESSE
		
		    //1- ajouter 
		
		/*Adresse a= new Adresse();
		a.setNumRue("12");
		a.setNomRue("Rue albert camus");	
		a.setCp("92000");
		a.setVille("Amiens");
		service.ajouterAdresse(a);*/
	       
		   //2- get Adresse
		
		/*Adresse a1= service.affichageAdresse(1);
		System.out.println(a1);*/
		
		//3- Supprimer Adresse
		
		/*Adresse a2= service.getAdresse(4);
        service.supprimerAdresse(a2);*/
		
		//4-modifier adresse
				/*Adresse a3= service.affichageAdresse(2);
				a3.setNumRue("27");
				a3.setNomRue(" Avenue Jean Jaures");
				a3.setCp("80000");
				a3.setVille("Gagny");
				service.modifierAdresse(a3);*/
		
		// 5-Lister adresse
		
			/*System.out.println(service.findAllAdresse());*/
		
		// Lister adresse avec condition
		
				/*for (Adresse a4 : service.rechercherParMcAdresse("JEAN")){
					System.out.println(a4); */
		
		//POUR CONNEXION
		
          //1- ajouter 
		
		/*Connexion c= new Connexion();
		c.setLogin("ghrte");
		c.setMdp("258964");	
		
		service.ajouterConnexion(c);*/
		
         //2- get Connexion
		
		/*Connexion c1= service.affichageConnexion(1);
		System.out.println(c1);*/
		
		
		//3- Supprimer Connexion
		
				/*Connexion c2= service.getConnexion(4);
		        service.supprimerConnexion(c2);*/
		
		//4-modifier Connexion
		
		/*Connexion c3= service.affichageConnexion(3);
		c3.setLogin("ahmedsouei");
		c3.setMdp("110899");
		service.modifierConnexion(c3);*/
		
		// 5-Lister Connexion
		
		/*System.out.println(service.findAllConnexion());*/
		
		
		// Lister Connexion avec condition

		/*for (Connexion c4: service.rechercherParMcConnexion("sou")){
			System.out.println(c4); */
		
		//exemple ajouter une adresse à une personne
		/*Personne p =new Personne();
	    Adresse a = new Adresse();
	    a.setCp("93500");
		a.setNomRue("avenue Camille");
		a.setNumRue("25");
		a.setVille("marseille");
		p.setNom("ayadi");
		p.setPrenom("ali");
		p.setAge(14);
		p.setAdresse(a);
		service.ajouterPersonne(p);// Sans Cascade le lanceur ne rajoute pas la personne et adresse dans BDD//
		                           // avec Cascade le lanceur rajoute la personne et adresse dans BDD//
		
		// suuprimer adresse ajoutée sans supprimer personne
		/*Adresse a2= service.getAdresse(5);
        service.supprimerAdresse(a2);*/
		
		// appel à la methode PersonneConnexion jointure A join/ left join/ right join/ full join B
		
		/*for(Personne pers: service.findAllPersonnesConnexion()) {
			System.out.println(pers+ " "+pers.getConnexion());
		
		}*/
		
		// appel à la methode PersonneAdresse jointure A join/ left join/ right join/ full join B
		
		for(Personne pers: service.findAllPersonnesAdresse()) {
			System.out.println(pers+ " "+pers.getAdresse());
		
        }
	}
}
	






