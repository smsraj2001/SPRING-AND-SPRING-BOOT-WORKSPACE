package com.tvsmotor.entity;
 
import java.util.Set;
 
import com.fasterxml.jackson.annotation.JsonBackReference;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
 
@Entity
public class Vehicle {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehid;
	private String vehname;
	private String engine;

	@JsonBackReference
	   @ManyToOne
	    @JoinColumn(name = "dealer_id")
	    Dealer deal;
 
 
	public Vehicle() {
		super();
	}
 
 
	public Vehicle(int vehid, String vehname, String engine, Dealer deal) {
		super();
		this.vehid = vehid;
		this.vehname = vehname;
		this.engine = engine;
		this.deal = deal;
	}
 
 
	public int getVehid() {
		return vehid;
	}
 
 
	public void setVehid(int vehid) {
		this.vehid = vehid;
	}
 
 
	public String getVehname() {
		return vehname;
	}
 
 
	public void setVehname(String vehname) {
		this.vehname = vehname;
	}
 
 
	public String getEngine() {
		return engine;
	}
 
 
	public void setEngine(String engine) {
		this.engine = engine;
	}
 
 
	public Dealer getDeal() {
		return deal;
	}
 
 
	public void setDeal(Dealer deal) {
		this.deal = deal;
	}
}