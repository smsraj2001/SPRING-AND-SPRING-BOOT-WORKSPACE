package com.tvsmotor.model;

public class Vehicle {
	
	private int id;
	private String name;
	private String category;
	private double amount;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int id, String name, String category, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.amount = amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", category=" + category + ", amount=" + amount + "]";
	}

}
