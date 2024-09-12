package com.tvsmotor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvsmotor.entity.Employee;
import com.tvsmotor.exception.IdNotFoundException;
import com.tvsmotor.exception.InValidAgeException;
import com.tvsmotor.repository.EmployeeRepository;

@Service // It will configure the bean
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired // It will inject the bean
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		if(employee.getAge() < 18)
		{
			throw new InValidAgeException("Invalid age...");
		}
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee viewEmployeeById(int id) {
		// employeeRepository.findById(id).orElseThrow(() -> new IdNotFoundException("Employee ID not found"));
		
		Optional<Employee> opEmployee = employeeRepository.findById(id);
		if(opEmployee.isPresent())
		{
			throw new IdNotFoundException("The given id " + id + " is Invalid.");
		}
		return opEmployee.get();
	}

	@Override
	public String deleteEmployeeById(int id) {
		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new IdNotFoundException("Invalid ID to delete"));
		employeeRepository.delete(employee);
		// employeeRepository.deleteById(employee.getId());
		
		return "Employee with ID " + id + " is deleted.";
	}

	@Override
	public Employee updateEmployeeById(int id, Employee employee) 
	{
//		Optional<Employee> employee2 = employeeRepository.findById(id);
//		Employee updatedEmp = null;
//		if(employee2.isPresent())
//		{
//			updatedEmp = employee2.get();
//			updatedEmp.setName(employee.getName());
//			updatedEmp.setSalary(employee.getSalary());
//			updatedEmp.setDept(employee.getDept());
//			updatedEmp.setAge(employee.getAge());
//			employeeRepository.save(updatedEmp);
//		}
//		return updatedEmp;
		
		return employeeRepository.findById(id)
		        .map(emp -> {
		            emp.setName(employee.getName());
		            emp.setSalary(employee.getSalary());
		            emp.setDept(employee.getDept());
		            emp.setAge(employee.getAge());
		            return employeeRepository.save(emp);
		        }).orElseThrow(() -> new IdNotFoundException("Invalid ID to delete"));		
	}

}
