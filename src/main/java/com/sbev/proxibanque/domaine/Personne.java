package com.sbev.proxibanque.domaine;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Personne {
	
	private String prenom;
	private String nom;
	
	
	public Personne(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	public Personne() {
		super();
	}


	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
