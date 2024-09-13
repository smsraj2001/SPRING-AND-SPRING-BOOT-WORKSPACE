package com.tvsmotor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	List<Employee> findByDept(String dept);
	Integer countByName(String name);
	Integer countByDept(String dept);
	Employee findByDeptAndName(String dept, String name);
	List<Employee> findByAgeGreaterThan(int age);
	List<Employee> findByAgeLessThan(int age);
}
