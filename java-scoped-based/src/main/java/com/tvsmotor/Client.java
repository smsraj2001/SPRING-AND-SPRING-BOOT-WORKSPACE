package com.tvsmotor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client 
{
	public static void main(String[] args) 
	{	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("emp");
		Employee employee7 = (Employee) context.getBean("emp");
		System.out.println(employee.hashCode());
		System.out.println(employee7.hashCode());
		employee.displayEmployeeInfo();
		System.out.println("-----------------------------------------");
		Employee employee2 = (Employee) context.getBean("empId");
		employee2.displayEmployeeInfo();
		System.out.println("-----------------------------------------");
		Employee employee3 = (Employee) context.getBean("empName");
		employee3.displayEmployeeInfo();
		System.out.println("-----------------------------------------");
		Employee employee4 = (Employee) context.getBean("empIdAndName");
		employee4.displayEmployeeInfo();
		System.out.println("-----------------------------------------");
//		Employee employee5 = (Employee) context.getBean("employeeNameAndAddress");
//		employee5.displayEmployeeInfo();
//		System.out.println("-----------------------------------------");
//		context.close();
	}
}