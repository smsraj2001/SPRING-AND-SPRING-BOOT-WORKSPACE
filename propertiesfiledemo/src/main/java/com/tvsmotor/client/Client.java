package com.tvsmotor.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tvsmotor.config.AppConfig;
import com.tvsmotor.model.Employee;
import com.tvsmotor.model.Login;

public class Client 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// context.refresh();
		String name, password;
		Employee employee;
		Login log;
		Scanner scan = new Scanner(System.in);
		
		employee = (Employee) context.getBean("employee");
		employee.displayEmployeeInfo();
		System.out.println("Enter the credentials:-");
		System.out.println("Enter the username");
		name = scan.next();
		System.out.println("Enter the password");
		password = scan.next();
		log = (Login) context.getBean("login");
		log.checkUserPassword(name, password);
		context.close();
	}
}
