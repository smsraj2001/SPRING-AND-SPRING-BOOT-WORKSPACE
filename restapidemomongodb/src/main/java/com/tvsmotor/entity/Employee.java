package com.tvsmotor.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee 
{
	@Id
	private String _id;
	private String name;
	private String dept;
	private int age;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String _id, String name, String dept, int age, double salary) {
		super();
		this._id = _id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [_id=" + _id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", salary=" + salary + "]";
	}
	
}