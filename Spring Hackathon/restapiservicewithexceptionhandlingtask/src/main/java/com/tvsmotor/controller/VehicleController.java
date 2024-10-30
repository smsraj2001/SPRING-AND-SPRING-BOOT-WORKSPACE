package com.tvsmotor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tvsmotor.entity.Vehicle;
import com.tvsmotor.service.VehicleService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // Corrected method to take dealerId as a query parameter
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle, @RequestParam Long dealerId) {
        return vehicleService.addVehicle(vehicle, dealerId);
    }

    @GetMapping("/available")
    public List<Vehicle> getAvailableVehicles() {
        return vehicleService.getAvailableVehicles();
    }

    @GetMapping("/dealer/{dealerId}")
    public List<Vehicle> getVehiclesByDealerId(@PathVariable Long dealerId) {
        return vehicleService.getVehiclesByDealerId(dealerId);
    }

    @PutMapping("/{vehicleId}/price")
    public Vehicle updateVehiclePrice(@PathVariable Long vehicleId, @RequestParam BigDecimal price) {
        return vehicleService.updateVehiclePrice(vehicleId, price);
    }

    @PutMapping("/{vehicleId}/status/sold")
    public Vehicle markVehicleAsSold(@PathVariable Long vehicleId) {
        return vehicleService.markVehicleAsSold(vehicleId);
    }

    @DeleteMapping("/{vehicleId}")
    public void deleteVehicleById(@PathVariable Long vehicleId) {
        vehicleService.deleteVehicleById(vehicleId);
    }
}
