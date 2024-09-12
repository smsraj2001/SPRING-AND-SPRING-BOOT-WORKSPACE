package com.tvsmotor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.Employee;
import com.tvsmotor.repository.EmployeeRepository;

@RequestMapping("/api/v1")
@RestController
public class EmployeeController 
{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> viewAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return employeeRepository.findById(id).get();
//		Optional<Employee> opEmp = employeeRepository.findById(id);
//		if(opEmp.isEmpty())
//		{
//			System.out.println("No employee found!!!");
//		}
//		else
//		{
//			return opEmp;
//		}
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteByEmployeeId(@PathVariable int id)
	{
		employeeRepository.deleteById(id);
		return "Employee deleted with id: " + id;		
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployeeById(@PathVariable int id, @RequestBody Employee employee)
	{
		Optional<Employee> employee2 = employeeRepository.findById(id);
		Employee updatedEmp = null;
		if(employee2.isPresent())
		{
			updatedEmp = employee2.get();
			updatedEmp.setName(employee.getName());
			updatedEmp.setSalary(employee.getSalary());
			updatedEmp.setDept(employee.getDept());
			updatedEmp.setAge(employee.getAge());
			employeeRepository.save(updatedEmp);
		}
		return updatedEmp;		
	}
}