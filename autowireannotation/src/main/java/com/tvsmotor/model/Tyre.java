package com.tvsmotor.model;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
	
	int noOfTyres;

	public void setTyre(int noOfTyres) 
	{
		this.noOfTyres = noOfTyres;
	}
	
	void displayTyreInfo()
	{
		System.out.println("Number of tyres is " + noOfTyres);
	}
}
