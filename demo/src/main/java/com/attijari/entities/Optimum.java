package com.attijari.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Optimum implements Serializable {
@Id @GeneratedValue
String ID ;
@Column
float opt1;
@Column
float opt2 ;
public Optimum(String iD, float opt1, float opt2) {
	super();
	ID = iD;
	this.opt1 = opt1;
	this.opt2 = opt2;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public float getOpt1() {
	return opt1;
}
public void setOpt1(float opt1) {
	this.opt1 = opt1;
}
public float getOpt2() {
	return opt2;
}
public void setOpt2(float opt2) {
	this.opt2 = opt2;
}
}
