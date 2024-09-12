package com.tvsmotor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.Employee;
import com.tvsmotor.exception.IdNotFoundException;
import com.tvsmotor.exception.InValidAgeException;
import com.tvsmotor.service.EmployeeService;

@RequestMapping("/api/v1")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.viewAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return employeeService.viewEmployeeById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id)
	{
		return employeeService.deleteEmployeeById(id);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployeeById(@RequestBody Employee employee, @PathVariable int id)
	{
		return employeeService.updateEmployeeById(id, employee);
	}
}