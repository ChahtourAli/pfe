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
public class Agence implements Serializable {
@Id @GeneratedValue
String ID;
@Column
float soldeEnCaisse;
@Column
float code ;
@OneToMany(mappedBy ="agence")
Collection <Utilisateur> utilisateur;
@ManyToOne 
Ville ville;

public Collection<Utilisateur> getUtilisateur() {
	return utilisateur;
}

public void setUtilisateur(Collection<Utilisateur> utilisateur) {
	this.utilisateur = utilisateur;
}

public Ville getVille() {
	return ville;
}

public void setVille(Ville ville) {
	this.ville = ville;
}

public Agence(String iD, float soldeEnCaisse, float code) {
	super();
	ID = iD;
	this.soldeEnCaisse = soldeEnCaisse;
	this.code = code;
}

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public float getSoldeEnCaisse() {
	return soldeEnCaisse;
}

public void setSoldeEnCaisse(float soldeEnCaisse) {
	this.soldeEnCaisse = soldeEnCaisse;
}

public float getCode() {
	return code;
}

public void setCode(float code) {
	this.code = code;
}

}
