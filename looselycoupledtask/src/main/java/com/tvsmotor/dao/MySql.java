package com.tvsmotor.dao;

import org.springframework.stereotype.Component;

@Component
public class MySql implements DataAccess {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Coonected to MySQL");
	}
}