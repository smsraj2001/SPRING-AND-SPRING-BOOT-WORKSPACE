package com.tvsmotor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvsmotor.entity.Dealer;
import com.tvsmotor.exception.IDNotFoundException;
import com.tvsmotor.repository.DealerRepository;

@Service
public class DealerServiceImpl implements DealerService {

    @Autowired
    private DealerRepository dealerRepository;

    @Override
    public Dealer addDealer(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    @Override
    public List<Dealer> getAllDealers() {
        return dealerRepository.findAll();
    }

    @Override
    public List<Dealer> searchDealerByLocation(String location) {
        return dealerRepository.findByLocation(location);
    }

    @Override
    public Dealer updateDealerContact(Long dealerId, String contactNumber, String email) {
        Optional<Dealer> dealerOptional = dealerRepository.findById(dealerId);
        if (dealerOptional.isPresent()) {
            Dealer dealer = dealerOptional.get();
            dealer.setContactNumber(contactNumber);
            dealer.setEmail(email);
            return dealerRepository.save(dealer);
        } else {
            throw new IDNotFoundException("Dealer ID not found");
        }
    }
}
