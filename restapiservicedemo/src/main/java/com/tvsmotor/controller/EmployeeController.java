package com.tvsmotor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.Employee;
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
}
