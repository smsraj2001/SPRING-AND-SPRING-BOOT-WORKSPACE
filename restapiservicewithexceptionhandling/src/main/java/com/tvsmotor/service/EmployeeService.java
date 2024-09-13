package com.tvsmotor.service;

import java.util.List;

import com.tvsmotor.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	List<Employee> viewAllEmployee();
	Employee viewEmployeeById(int id);
	String deleteEmployeeById(int id);
	Employee updateEmployeeById(int id, Employee employee);
	
	List<Employee> findEmployeeByDept(String dept);
	int countEmployeeByDept(String dept);
	Employee findByDeptAndName(String dept, String name);
	List<Employee> findByAgeGreaterThan(int age);
	List<Employee> findByAgeLessThan(int age);
}
