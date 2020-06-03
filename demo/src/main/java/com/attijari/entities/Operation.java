package com.attijari.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Operation implements Serializable{
@Id @GeneratedValue
String ID;
@Column
float montant;
@Column
Date date;
@Column
String validation;
@ManyToOne
Type type;
@ManyToOne
Utilisateur utilisateur ;
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
public Utilisateur getUtilisateur() {
	return utilisateur;
}
public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}
public Operation(String iD, float montant, Date date, String validation) {
	super();
	ID = iD;
	this.montant = montant;
	this.date = date;
	this.validation = validation;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public float getMontant() {
	return montant;
}
public void setMontant(float montant) {
	this.montant = montant;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getValidation() {
	return validation;
}
public void setValidation(String validation) {
	this.validation = validation;
}
}
