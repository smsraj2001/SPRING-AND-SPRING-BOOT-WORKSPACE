package com.tvsmotor.service;

import java.util.List;

import com.tvsmotor.dto.VehicleDto;

public interface VehicleInterface {
	VehicleDto addVehicle(VehicleDto vehicleDto);
	List<VehicleDto> viewAllVehicle();
	String deleteVehicleById(int id);
}
