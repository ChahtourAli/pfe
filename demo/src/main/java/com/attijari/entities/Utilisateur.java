package com.attijari.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable {
	
	@Id @GeneratedValue
    String ID ;
	@Column
	String login ;
	@Column
	String motDePasse ;
	@ManyToOne
	Agence agence ;
	@OneToMany(mappedBy="utilisateur")
	Collection <Operation> operations ;
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	public Utilisateur(String iD, String login, String motDePasse) {
		super();
		ID = iD;
		this.login = login;
		this.motDePasse = motDePasse;
	}
	@Override
	public String toString() {
		return "Utilisateur [ID=" + ID + ", login=" + login + ", motDePasse=" + motDePasse + "]";
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
}
