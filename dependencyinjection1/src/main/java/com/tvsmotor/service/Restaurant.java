package com.tvsmotor.service;

public class Restaurant {
	Tea tea;
	String address;
	int noOfEmployees;
	
	
	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public void restaurantName()
	{
		System.out.println("ABC Restaurant");
	}
	
	public void restaurantDetails()
	{
		tea.price();
		System.out.println("Address of the restaurant is " + address);
		System.out.println("No. of employees are " + noOfEmployees);
	}
}
