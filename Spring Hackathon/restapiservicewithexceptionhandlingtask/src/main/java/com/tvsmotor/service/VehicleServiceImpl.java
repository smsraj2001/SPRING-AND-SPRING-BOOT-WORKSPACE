package com.tvsmotor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvsmotor.entity.Dealer;
import com.tvsmotor.entity.Vehicle;
import com.tvsmotor.exception.IDNotFoundException;
import com.tvsmotor.repository.DealerRepository;
import com.tvsmotor.repository.VehicleRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private DealerRepository dealerRepository; // Correct reference to DealerRepository

    @Override
    public Vehicle addVehicle(Vehicle vehicle, Long dealerId) throws IDNotFoundException {
        // Fetch the dealer using dealerRepository
        Dealer dealer = dealerRepository.findById(dealerId)
                .orElseThrow(() -> new IDNotFoundException("Dealer not found with ID: " + dealerId));

        // Set the dealer in the vehicle entity
        vehicle.setDealer(dealer);

        // Save and return the vehicle
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getVehiclesByDealerId(Long dealerId) {
        return vehicleRepository.findByDealer_DealerId(dealerId);
    }

    @Override
    public Vehicle updateVehiclePrice(Long vehicleId, BigDecimal price) {
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(vehicleId);
        if (vehicleOptional.isPresent()) {
            Vehicle vehicle = vehicleOptional.get();
            vehicle.setPrice(price);
            return vehicleRepository.save(vehicle);
        } else {
            throw new IDNotFoundException("Vehicle ID not found");
        }
    }

    @Override
    public Vehicle markVehicleAsSold(Long vehicleId) {
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(vehicleId);
        if (vehicleOptional.isPresent()) {
            Vehicle vehicle = vehicleOptional.get();
            vehicle.setStatus("Sold");
            return vehicleRepository.save(vehicle);
        } else {
            throw new IDNotFoundException("Vehicle ID not found");
        }
    }

    @Override
    public List<Vehicle> getAvailableVehicles() {
        return vehicleRepository.findByStatus("Available");
    }

    @Override
    public void deleteVehicleById(Long vehicleId) {
        if (!vehicleRepository.existsById(vehicleId)) {
            throw new IDNotFoundException("Vehicle ID not found");
        }
        vehicleRepository.deleteById(vehicleId);
    }
}
