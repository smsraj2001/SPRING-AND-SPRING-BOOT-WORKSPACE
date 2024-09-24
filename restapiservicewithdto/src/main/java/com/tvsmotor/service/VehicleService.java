package com.tvsmotor.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvsmotor.dto.VehicleDto;
import com.tvsmotor.entity.Vehicle;
import com.tvsmotor.repository.VehicleRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Service
public class VehicleService implements VehicleInterface 
{
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public VehicleDto addVehicle(VehicleDto vehicleDto) {
		return convertToDto(vehicleRepository.save(convertToEntity(vehicleDto)));
	}

	@Override
	public List<VehicleDto> viewAllVehicle() {
		List<Vehicle> vehicles = vehicleRepository.findAll();
		List<VehicleDto> vehicleDtos = new ArrayList<VehicleDto>();
		for(Vehicle vehicle : vehicles)
		{
			if(!vehicle.isDeleted())
				vehicleDtos.add(convertToDto(vehicle));
		}
		return vehicleDtos;	
		
	}
	
	@Override
	public String deleteVehicleById(int id) {
		Vehicle vehicle = vehicleRepository.findById(id).get();
		vehicle.setDeleted(true);
		vehicleRepository.save(vehicle);
//		vehicleRepository.deleteById(id);
		
		return "Vehicle: " + id + " deleted sucessfully";
	}
	
	private VehicleDto convertToDto(Vehicle vehicle)
	{
		VehicleDto vehicleDto = new VehicleDto();
		vehicleDto.setId(vehicle.getId());
		vehicleDto.setName(vehicle.getName());
		vehicleDto.setMileage(vehicle.getMileage());
		vehicleDto.setManufacturingDate(vehicle.getManufacturingDate());
		vehicleDto.setPrice(vehicle.getPrice());
		return vehicleDto;
	}
	
	private Vehicle convertToEntity(VehicleDto vehicleDto)
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setName(vehicleDto.getName());
		vehicle.setMileage(vehicleDto.getMileage());
		vehicle.setPrice(vehicleDto.getPrice());
		vehicle.setType(vehicleDto.getType());
		vehicle.setManufacturingDate(LocalDate.now());
		vehicle.setCreateDate(LocalDateTime.now());
		vehicle.setUpdateDate(LocalDateTime.now());
		vehicle.setDeleted(false);
		return vehicle;
	}
}