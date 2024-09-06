package com.tvsmotor.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tvsmotor.config.AppConfig;
import com.tvsmotor.model.Employee;

public class Client 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("employee");
		employee.displayEmployeeMessage();
		context.close();
	}
}
