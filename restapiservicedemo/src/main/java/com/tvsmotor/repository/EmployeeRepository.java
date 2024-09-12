package com.tvsmotor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	
}
