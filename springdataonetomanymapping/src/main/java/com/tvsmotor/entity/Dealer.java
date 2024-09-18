package com.tvsmotor.entity;
 
import java.util.List;
 
import com.fasterxml.jackson.annotation.JsonManagedReference;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
 
@Entity
public class Dealer {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	@JsonManagedReference
	  @OneToMany(mappedBy = "deal", cascade = CascadeType.ALL, orphanRemoval = true)
	  private List<Vehicle> ob;
 
	 
	public Dealer() {
		super();
	}
 
 
	public Dealer(int id, String name, String city, List<Vehicle> ob) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.ob = ob;
	}
 
 
	public int getId() {
		return id;
	}
 
 
	public void ListId(int id) {
		this.id = id;
	}
 
 
	public String getName() {
		return name;
	}
 
 
	public void ListName(String name) {
		this.name = name;
	}
 
 
	public String getCity() {
		return city;
	}
 
 
	public void ListCity(String city) {
		this.city = city;
	}
 
 
	public List<Vehicle> getOb() {
		return ob;
	}
 
 
	public void ListOb(List<Vehicle> ob) {
		this.ob = ob;
	}
 
 
	@Override
	public String toString() {
		return "Dealer [id=" + id + ", name=" + name + ", city=" + city + ", ob=" + ob + "]";
	}	
}