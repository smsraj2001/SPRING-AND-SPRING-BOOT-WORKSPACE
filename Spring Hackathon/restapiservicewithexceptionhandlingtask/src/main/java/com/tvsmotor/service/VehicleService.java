package com.tvsmotor.service;

import java.math.BigDecimal;
import java.util.List;

import com.tvsmotor.entity.Vehicle;

public interface VehicleService {
    Vehicle addVehicle(Vehicle vehicle, Long dealerId);
    List<Vehicle> getVehiclesByDealerId(Long dealerId);
    Vehicle updateVehiclePrice(Long vehicleId, BigDecimal price);
    Vehicle markVehicleAsSold(Long vehicleId);
    List<Vehicle> getAvailableVehicles();
    void deleteVehicleById(Long vehicleId);
}
