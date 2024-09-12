package com.tvsmotor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventory 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // For unique auto generation of ID.
	private int id;
	private String name;
	private int engine;
	private int weight;
	private String category;
	private String power;
	private double price;
	private String type;
	private int stock;
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(int id, String name, int engine, int weight, String category, String power, double price,
			String type, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.engine = engine;
		this.weight = weight;
		this.category = category;
		this.power = power;
		this.price = price;
		this.type = type;
		this.stock = stock;
		
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

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}