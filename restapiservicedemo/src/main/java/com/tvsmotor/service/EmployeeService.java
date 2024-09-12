package com.tvsmotor.service;

import java.util.List;

import com.tvsmotor.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	List<Employee> viewAllEmployee();
	Employee viewEmployeeById(int id);
	String deleteEmployeeById(int id);
	Employee updateEmployeeById(int id, Employee employee);
}
