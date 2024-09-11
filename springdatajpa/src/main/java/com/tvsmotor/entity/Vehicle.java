package com.tvsmotor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle21") // To give other table name
public class Vehicle {
	
	@Id // Makes the below one ID
	@Column(name = "vehicle_id")
	private int id;
	private String name;
	private String category;
	private int model;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int id, String name, String category, int model) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", category=" + category + ", model=" + model + "]";
	}
}
