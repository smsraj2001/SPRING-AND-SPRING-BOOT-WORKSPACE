package com.tvsmotor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.Employee;
import com.tvsmotor.service.EmployeeService;

@RestController
@RequestMapping("/api/v2")
public class EmployeeController2 
{
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.OK);
	}
	
	@GetMapping("/employee")
	ResponseEntity<List <Employee>> viewAllEmployee()
	{
		return new ResponseEntity<List<Employee>>(employeeService.viewAllEmployee(), HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	ResponseEntity<Employee> viewEmployeeById(@PathVariable int id)
	{
		return new ResponseEntity<Employee>(employeeService.viewEmployeeById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/employee/{id}")
	ResponseEntity<String> deleteEmployeeById(@PathVariable int id)
	{
		return new ResponseEntity<String>(employeeService.deleteEmployeeById(id), HttpStatus.OK);
	}
	
	@GetMapping("/employee/findbydept/{dept}")
	ResponseEntity<List<Employee>> findEmployeeByDept(@PathVariable String dept)
	{
		return new ResponseEntity<List<Employee>>(employeeService.findEmployeeByDept(dept), HttpStatus.OK);
	}
	
	@GetMapping("/employee/countbydept/{dept}")
	ResponseEntity<Integer> countEmployeeByDept(@PathVariable String dept)
	{
		return new ResponseEntity<Integer>(employeeService.countEmployeeByDept(dept), HttpStatus.OK);
	}
	
	@GetMapping("/employee/findbydeptandname/{dept}/{name}")
	ResponseEntity<Employee> findByDeptAndName(@PathVariable String dept, @PathVariable String name)
	{
		return new ResponseEntity<Employee>(employeeService.findByDeptAndName(dept, name), HttpStatus.OK);
	}
	
	@GetMapping("/employee/findbyagegreatthan/{age}")
	ResponseEntity<List<Employee>> findByAgeGreaterThan(@PathVariable int age)
	{
		return new ResponseEntity<List<Employee>>(employeeService.findByAgeGreaterThan(age), HttpStatus.OK);
	}
	
	@GetMapping("/employee/findbyagelessthan/{age}")
	ResponseEntity<List<Employee>> findByAgeLessThan(@PathVariable int age)
	{
		return new ResponseEntity<List<Employee>>(employeeService.findByAgeLessThan(age), HttpStatus.OK);
	}
	
}
