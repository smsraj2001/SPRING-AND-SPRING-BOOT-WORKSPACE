package com.tvsmotor.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Scope("singleton") // This is default
//@Scope("prototype")
@Component
public class Vehicle 
{	
	String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void displayVehicleInfo()
	{
		System.out.println("Name: " + name);
	}
}
