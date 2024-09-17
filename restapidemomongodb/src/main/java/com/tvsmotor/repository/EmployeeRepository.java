package com.tvsmotor.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.tvsmotor.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>
{
	
}
