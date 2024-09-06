package com.tvsmotor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig 
{
	@Scope("prototype")
	@Bean(name = "emp") // Now client will look for bean name with "emp" only
	public Employee createEmployeeInstance()
	{
		return new Employee();
	}
	
	@Scope("singleton")
	@Bean(name = "empId")
	public Employee createEmployeeInstance2()
	{
		return new Employee(1);
	}
	
	@Scope("singleton")
	@Bean(name = "empName")
	public Employee createEmployeeInstance3()
	{
		return new Employee("Ganesh");
	}
	
	@Scope("singleton")
	@Bean(name = "empIdAndName")
	public Employee createEmployeeInstance4()
	{
		return new Employee(100, "Sachin");
	}
	
	@Scope("singleton")
	@Bean(name = "employeeNameAndAddress")
	public Employee createEmployeeInstance5()
	{
		return new Employee(100, "Sachin", getAddress());
		
	}
	
	@Scope("singleton")
	@Bean(name = "empAddress")
	public Address getAddress()
	{
		return new Address("BTM", "Bangalore");
	}
}