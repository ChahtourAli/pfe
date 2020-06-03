package com.attijari.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type implements Serializable{
@Id @GeneratedValue
String ID ;
@Column
String nom;
@OneToMany(mappedBy ="type")
Collection <Operation> operations ;
public Collection<Operation> getOperations() {
	return operations;
}
public void setOperations(Collection<Operation> operations) {
	this.operations = operations;
}
public Type(String iD, String nom) {
	super();
	ID = iD;
	this.nom = nom;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
}
