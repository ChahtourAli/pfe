package com.attijari.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Ville  implements Serializable{
@Id @GeneratedValue
String ID ;
@Column
String nome;
@Column
String région;
@OneToMany(mappedBy="ville")
Collection <Agence> agences;
public Collection<Agence> getAgences() {
	return agences;
}
public void setAgences(Collection<Agence> agences) {
	this.agences = agences;
}
public Ville(String iD, String nome, String région) {
	super();
	ID = iD;
	this.nome = nome;
	this.région = région;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getRégion() {
	return région;
}
public void setRégion(String région) {
	this.région = région;
}
}