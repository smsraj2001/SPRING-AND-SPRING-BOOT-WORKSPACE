package com.tvsmotor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tvsmotor.dao.DataAccess;

@Component
public class VehicleDetailsService {

	@Qualifier("oracle")
	@Autowired
	DataAccess dataAccess;

	public void showVehicleInfo() {
		System.out.println("Enter username and password");
		System.out.println("Approved!!! Connected to the database");
		dataAccess.connect();
	}
}