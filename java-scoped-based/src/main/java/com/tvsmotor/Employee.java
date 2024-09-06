package com.tvsmotor;

public class Employee 
{
	int id;
	String name;
	Address address;
	
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, Address address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public void displayEmployeeInfo()
	{
		System.out.println("This is Employee Info");
		System.out.println("Emp ID " + id);
		System.out.println("Emp name " + name);
		System.out.println("Street " + address.street);
		System.out.println("City " + address.city);
	}
}