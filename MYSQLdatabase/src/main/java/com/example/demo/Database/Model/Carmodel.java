package com.example.demo.Database.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carmodel {
	@Id
	private String cmodel;
	private int cprice;
	private String cfueltype;
	private String cengine;
	private int cseats;
	private String ctransmission;
	private int ccc;
	private int chp;
	private int ctopspeed;
	private String cmileage;
	public String getCmodel() {
		return cmodel;
	}
	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public String getCfueltype() {
		return cfueltype;
	}
	public void setCfueltype(String cfueltype) {
		this.cfueltype = cfueltype;
	}
	public String getCengine() {
		return cengine;
	}
	public void setCengine(String cengine) {
		this.cengine = cengine;
	}
	public int getCseats() {
		return cseats;
	}
	public void setCseats(int cseats) {
		this.cseats = cseats;
	}
	public String getCtransmission() {
		return ctransmission;
	}
	public void setCtransmission(String ctransmission) {
		this.ctransmission = ctransmission;
	}
	public int getCcc() {
		return ccc;
	}
	public void setCcc(int ccc) {
		this.ccc = ccc;
	}
	public int getChp() {
		return chp;
	}
	public void setChp(int chp) {
		this.chp = chp;
	}
	public int getCtopspeed() {
		return ctopspeed;
	}
	public void setCtopspeed(int ctopspeed) {
		this.ctopspeed = ctopspeed;
	}
	public String getCmileage() {
		return cmileage;
	}
	public void setCmileage(String cmileage) {
		this.cmileage = cmileage;
	}
	

	

}
