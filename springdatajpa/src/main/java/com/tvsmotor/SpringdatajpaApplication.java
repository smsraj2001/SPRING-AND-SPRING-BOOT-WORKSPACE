package com.tvsmotor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tvsmotor.dao.VehicleRepository;
import com.tvsmotor.entity.Vehicle;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner 
{
	@Autowired
	VehicleRepository vehcileRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle(1, "Jupiter", "Scooter", 67000);
		vehcileRepository.save(vehicle);
		
	}
}
