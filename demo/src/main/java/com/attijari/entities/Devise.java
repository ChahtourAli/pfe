package com.attijari.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Devise implements Serializable{
@Id @GeneratedValue
String ID;
@Column
float code ;
@Column
String nom;
public Devise(String iD, float code, String nom) {
	super();
	ID = iD;
	this.code = code;
	this.nom = nom;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public float getCode() {
	return code;
}
public void setCode(float code) {
	this.code = code;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
}
