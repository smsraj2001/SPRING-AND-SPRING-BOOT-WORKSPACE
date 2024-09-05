package com.tvsmotor.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.iql.Training;
import com.tvsmotor.Employee;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		// context.scan("com.tvsmotor");
		context.scan("com");
		Employee emp = context.getBean(Employee.class);
		emp.displayEmployeeInfo();
		
		Training training = context.getBean(Training.class);
		training.trainingInfo();
		context.close();
	}
}
