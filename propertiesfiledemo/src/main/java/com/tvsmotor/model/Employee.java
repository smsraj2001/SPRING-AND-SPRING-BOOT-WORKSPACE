package com.tvsmotor.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("${emp.name}")
	String name;
	@Value("${emp.age}")
	int age;
	
	public void displayEmployeeInfo()
	{
		System.out.println("Employee Info");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
