package com.tvsmotor.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.iql.Training;
import com.tvsmotor.Employee;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		// context.scan("com.tvsmotor"); // It will check only this package, not the other package
		context.scan("com"); // Checks for all other packages.
		Employee emp = context.getBean(Employee.class); 
		emp.displayEmployeeInfo();
		
		Training training = context.getBean(Training.class);
		training.trainingInfo();
		context.close();
	}
}
