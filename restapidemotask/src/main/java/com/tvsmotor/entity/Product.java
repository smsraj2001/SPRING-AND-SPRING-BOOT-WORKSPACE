package com.tvsmotor.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String category;
	private LocalDate manufacturingDate;
	private double price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String category, LocalDate manufacturingDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.manufacturingDate = manufacturingDate;
		this.price = price;
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
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", manufacturingDate="
				+ manufacturingDate + ", price=" + price + "]";
	}
}
