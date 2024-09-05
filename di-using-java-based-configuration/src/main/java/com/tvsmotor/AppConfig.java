package com.tvsmotor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name = "emp") // Now client will look for bean name with "emp" only
	public Employee createEmployeeInstance()
	{
		return new Employee();
	}
	
	@Bean(name = "empId")
	public Employee createEmployeeInstance2()
	{
		return new Employee(1);
	}
	
	@Bean(name = "empName")
	public Employee createEmployeeInstance3()
	{
		return new Employee("Ganesh");
	}
	
	@Bean(name = "empIdAndName")
	public Employee createEmployeeInstance4()
	{
		return new Employee(100, "Sachin");
	}
	
	@Bean(name = "employeeNameAndAddress")
	public Employee createEmployeeInstance5()
	{
		return new Employee(100, "Sachin", getAddress());
		
	}
	
	@Bean(name = "empAddress")
	public Address getAddress()
	{
		return new Address("BTM", "Bangalore");
	}
}