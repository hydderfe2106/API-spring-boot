package com.iitgl320222023.gestionecole.models;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professeur")

public class Professeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nom",nullable=false,unique=true)
	private String nom;
	
	@Column(name="prenom",nullable=false,unique=true)
	private String prenom;
	
	@Column(name="contact",nullable=false)
	private String contact;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="anneeEntreEnFonction",nullable=false)
	private Date anneeEntreEnFonction ;
	
	@Column(name="anneeFinFonction",nullable=false)
	private Date anneeFinFonction ;
	
	@Column(name="status",nullable=false)
	private boolean status;

	
	public Professeur(Long id, String nom, String prenom, String contact, Date anneeEntreEnFonction,
			Date anneeFinFonction, boolean status) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.contact = contact;
		this.anneeEntreEnFonction = anneeEntreEnFonction;
		this.anneeFinFonction = anneeFinFonction;
		this.status = status;
	}
	
	
	
	public Long getId() {
		return id;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getAnneeEntreEnFonction() {
		return anneeEntreEnFonction;
	}

	public void setAnneeEntreEnFonction(Date anneeEntreEnFonction) {
		this.anneeEntreEnFonction = anneeEntreEnFonction;
	}

	public Date getAnneeFinFonction() {
		return anneeFinFonction;
	}

	public void setAnneeFinFonction(Date anneeFinFonction) {
		this.anneeFinFonction = anneeFinFonction;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Professeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", contact=" + contact
				+ ", anneeEntreEnFonction=" + anneeEntreEnFonction + ", anneeFinFonction=" + anneeFinFonction
				+ ", status=" + status + "]";
	}

}
