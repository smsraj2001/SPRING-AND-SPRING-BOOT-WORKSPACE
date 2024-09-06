package com.tvsmotor.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Qualifier("dosa")
	@Autowired
	BreakFast breakFast;
	
	public void displayEmployeeMessage()
	{
		System.out.println("Walk to canteen");
		System.out.println("Rinse the plate");
		breakFast.eat();
	}
}